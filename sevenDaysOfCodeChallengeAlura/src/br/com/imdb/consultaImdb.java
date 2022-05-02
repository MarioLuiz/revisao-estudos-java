package br.com.imdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class consultaImdb {

	private static HttpURLConnection conn;

	public static void main(String[] args) throws IOException {
		// Creditos
		// https://medium.com/javarevisited/how-to-send-http-get-request-and-parse-json-data-into-string-using-java-3c0cf7eeebbc
		
		String keyImdb = "";
		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();
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
			System.out.println(responseContent.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
		}
	}

}
