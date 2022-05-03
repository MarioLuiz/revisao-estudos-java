package br.com.imdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		// Creditos
		// https://medium.com/javarevisited/how-to-send-http-get-request-and-parse-json-data-into-string-using-java-3c0cf7eeebbc
		
		String keyImdb = "";
		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();
		String response = "";
		List<Filme> filmes = new ArrayList<Filme>();
		
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
			//System.out.println(responseContent.toString());
			response = responseContent.toString();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
		filmes = parse(responseContent.toString(), filmes);
		filmes.forEach(f -> System.out.println(f));

	}
	
	public static List<Filme> parse(String responseBody, List<Filme> filmes) {
		JSONObject obj = new JSONObject(responseBody);
		JSONArray arr = obj.getJSONArray("items");
		Filme filme = new Filme();
		for (int i = 0 ; i < arr.length(); i++) {
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

}
