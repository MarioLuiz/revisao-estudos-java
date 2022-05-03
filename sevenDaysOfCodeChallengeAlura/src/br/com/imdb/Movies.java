package br.com.imdb;

import java.util.ArrayList;
import java.util.List;

public class Movies {
	private List<String> id;
	private List<String> rank;
	private List<String> title;
	private List<String> fullTitle;
	private List<String> year;
	private List<String> image;
	private List<String> crew;
	private List<String> imDbRating;
	private List<String> imDbRatingCount;

	public Movies() {
		this.id = new ArrayList<String>();
		this.rank = new ArrayList<String>();
		this.title = new ArrayList<String>();
		this.fullTitle = new ArrayList<String>();
		this.year = new ArrayList<String>();
		this.image = new ArrayList<String>();
		this.crew = new ArrayList<String>();
		this.imDbRating = new ArrayList<String>();
		this.imDbRatingCount = new ArrayList<String>();
	}

	public List<String> getId() {
		return id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	public List<String> getRank() {
		return rank;
	}

	public void setRank(List<String> rank) {
		this.rank = rank;
	}

	public List<String> getTitle() {
		return title;
	}

	public void setTitle(List<String> title) {
		this.title = title;
	}

	public List<String> getFullTitle() {
		return fullTitle;
	}

	public void setFullTitle(List<String> fullTitle) {
		this.fullTitle = fullTitle;
	}

	public List<String> getYear() {
		return year;
	}

	public void setYear(List<String> year) {
		this.year = year;
	}

	public List<String> getImage() {
		return image;
	}

	public void setImage(List<String> image) {
		this.image = image;
	}

	public List<String> getCrew() {
		return crew;
	}

	public void setCrew(List<String> crew) {
		this.crew = crew;
	}

	public List<String> getImDbRating() {
		return imDbRating;
	}

	public void setImDbRating(List<String> imDbRating) {
		this.imDbRating = imDbRating;
	}

	public List<String> getImDbRatingCount() {
		return imDbRatingCount;
	}

	public void setImDbRatingCount(List<String> imDbRatingCount) {
		this.imDbRatingCount = imDbRatingCount;
	}
}
