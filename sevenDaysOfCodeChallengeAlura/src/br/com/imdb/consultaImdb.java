package br.com.imdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class consultaImdb {

	private static HttpURLConnection conn;
	
	public static void main(String[] args) throws IOException {
		List<Movie> filmes = new ArrayList<Movie>();
		String json = new ImdbApiClient(conn).request();
		filmes = new ImdbMovieJsonParser(json).parse();
		
		PrintWriter writer = new PrintWriter("content.html");
		HtmlGenerator htmlGenerator = new HtmlGenerator(writer);
		htmlGenerator.head();
		htmlGenerator.generate(filmes);
		
		writer.close();
		
		//filmes.forEach(f -> System.out.println(f));
	}
	
}
