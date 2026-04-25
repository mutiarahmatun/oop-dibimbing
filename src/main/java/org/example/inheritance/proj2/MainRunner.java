package org.example.inheritance.proj2;

public class MainRunner {
    public static void main(String[] args) {

        // Movie Object
        Movie movie1 = new Movie(
                "Avengers",
                180,
                "MOV001",
                "Action"
        );

        // Constructor Overloading
        Movie movie2 = new Movie(
                "Interstellar",
                "MOV002"
        );

        // Series Object
        Series series1 = new Series(
                "Breaking Bad",
                45,
                "SER001",
                62
        );

        // Constructor Overloading
        Series series2 = new Series(
                "Friends",
                "SER002"
        );

        System.out.println("=== Movie 1 ===");
        movie1.showMovieInfo();

        System.out.println("\n=== Movie 2 ===");
        movie2.showMovieInfo();

        System.out.println("\n=== Series 1 ===");
        series1.showSeriesInfo();

        System.out.println("\n=== Series 2 ===");
        series2.showSeriesInfo();

        // Validation Test
        movie1.setMovieId("123");
        series1.setSeriesId("ABC");
        movie1.setDuration(-20);
    }
}
