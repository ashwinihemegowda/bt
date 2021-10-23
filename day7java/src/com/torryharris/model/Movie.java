package com.torryharris.model;

public class Movie implements Comparable<Movie> {
    private String title;
    private int year;
    private Float imdbRating;
    private Float collection;

    public Movie(String title, int year, Float imdbRating, Float collection) {
        this.title = title;
        this.year = year;
        this.imdbRating = imdbRating;
        this.collection = collection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Float getCollection() {
        return collection;
    }

    public void setCollection(Float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdbRating=" + imdbRating +
                ", collection=" + collection +" crores"+
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
