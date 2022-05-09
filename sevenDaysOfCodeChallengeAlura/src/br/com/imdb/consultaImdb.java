package br.com.imdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class consultaImdb {

	private static HttpURLConnection conn;
	
	public static void main(String[] args) throws IOException {
		List<Filme> filmes = new ArrayList<Filme>();
		String response = requestImdb();
		filmes = parse(response, filmes);
		
		PrintWriter writer = new PrintWriter("content.html");
		HtmlGenerator htmlGenerator = new HtmlGenerator(writer);
		htmlGenerator.head();
		htmlGenerator.generate(filmes);
		
		writer.close();
		
		filmes.forEach(f -> System.out.println(f));
	}
	
	
	public static List<Filme> parse(String responseBody, List<Filme> filmes) {
		JSONObject obj = new JSONObject(responseBody);
		JSONArray arr = obj.getJSONArray("items");
		for (int i = 0 ; i < arr.length(); i++) {
			Filme filme = new Filme();
			filme.setId(arr.getJSONObject(i).getString("id"));
			filme.setRank(arr.getJSONObject(i).getString("rank"));
			filme.setTitle(arr.getJSONObject(i).getString("title"));
			filme.setFullTitle(arr.getJSONObject(i).getString("fullTitle"));
			filme.setYear(arr.getJSONObject(i).getString("year"));
			filme.setImage(arr.getJSONObject(i).getString("image"));
			filme.setCrew(arr.getJSONObject(i).getString("crew"));
			filme.setImDbRating(arr.getJSONObject(i).getString("imDbRating"));
			filme.setImDbRatingCount(arr.getJSONObject(i).getString("imDbRatingCount"));
			filmes.add(filme);
		}
		return filmes;
	}
	
	public static String requestImdb() {
		// Creditos Consulta http
		// https://medium.com/javarevisited/how-to-send-http-get-request-and-parse-json-data-into-string-using-java-3c0cf7eeebbc
		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();
		String keyImdb = "";
		try {
			URL url = new URL("https://imdb-api.com/en/API/Top250Movies/" + keyImdb);
			conn = (HttpURLConnection) url.openConnection();

			// Request setup
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);

			// Test if the response from the server is successful
			int status = conn.getResponseCode();

			if (status >= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			return responseContent.toString();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
		return null;
	}
}
