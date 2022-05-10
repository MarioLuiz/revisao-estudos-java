package br.com.imdb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ImdbApiClient {
	private HttpURLConnection conn;

	public ImdbApiClient( HttpURLConnection conn) {
		this.conn = conn;
	}
	
	public String request() throws IOException {
		// Creditos Consulta http
		// https://medium.com/javarevisited/how-to-send-http-get-request-and-parse-json-data-into-string-using-java-3c0cf7eeebbc
		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();
		String keyImdb = recuperaKey();
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
	
	private String recuperaKey() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader("keyImdb.txt"));
		String linha = "";
		String key = "";
		while (true) {
			if (linha != null) {
				key = linha;
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
		return key;
	}
}
