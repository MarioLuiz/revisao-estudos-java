package br.com.imdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
		Movies filmes = new Movies();
		
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
		parse(responseContent.toString(), filmes);
		//System.out.println(response);
		filmes.getId().forEach(id -> {
			System.out.println(id);
		});
	}
	
	public static Movies parse(String responseBody, Movies filmes) {
		JSONObject obj = new JSONObject(responseBody);
		JSONArray arr = obj.getJSONArray("items");
		for (int i = 0 ; i < arr.length(); i++) {
			filmes.getId().add(arr.getJSONObject(i).getString("id"));
			filmes.getRank().add(arr.getJSONObject(i).getString("rank"));
			filmes.getTitle().add(arr.getJSONObject(i).getString("title"));
			filmes.getFullTitle().add(arr.getJSONObject(i).getString("fullTitle"));
			filmes.getYear().add(arr.getJSONObject(i).getString("year"));
			filmes.getImage().add(arr.getJSONObject(i).getString("image"));
			filmes.getCrew().add(arr.getJSONObject(i).getString("crew"));
			filmes.getImDbRating().add(arr.getJSONObject(i).getString("imDbRating"));
			filmes.getImDbRatingCount().add(arr.getJSONObject(i).getString("imDbRatingCount"));
		}
		return filmes;
	}

}
