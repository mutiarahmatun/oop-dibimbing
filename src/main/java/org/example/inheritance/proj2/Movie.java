package org.example.inheritance.proj2;

// Movie.java
public class Movie extends Content {

    private String movieId;
    protected String genre;

    // Constructor 1
    public Movie(String title, int duration, String movieId, String genre) {

        super(title, duration); // access constructor dari parent

        this.movieId = movieId;
        this.genre = genre;
    }

    // Constructor Overloading
    public Movie(String title, String movieId) {

        super(title);  // access constructor dari parent

        this.movieId = movieId;
        this.genre = "Unknown";
    }

    // Setter validation
    public void setMovieId(String movieId) {

        if (movieId.startsWith("MOV")) {
            this.movieId = movieId;
        } else {
            System.out.println("Movie ID must start with MOV");
        }
    }

    // Method
    public void showMovieInfo() {

        showContentInfo();

        System.out.println("Movie ID: " + movieId);
        System.out.println("Genre: " + genre);
    }
}