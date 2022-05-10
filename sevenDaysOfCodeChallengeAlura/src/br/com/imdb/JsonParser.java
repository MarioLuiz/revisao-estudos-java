package br.com.imdb;

import java.util.List;

public interface JsonParser {
	public List<? extends Content> parse();
}
