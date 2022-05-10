package br.com.imdb;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ImdbMovieJsonParser {
	
	String json;
	
	public ImdbMovieJsonParser(String json) {
		this.json = json;
	}

	public List<Movie> parse() {
		List<Movie> filmes = new ArrayList<Movie>();
		JSONObject obj = new JSONObject(json);
		JSONArray arr = obj.getJSONArray("items");
		for (int i = 0 ; i < arr.length(); i++) {
			Movie filme = new Movie();
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
