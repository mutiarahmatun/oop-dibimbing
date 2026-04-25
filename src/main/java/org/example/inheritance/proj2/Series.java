package org.example.inheritance.proj2;

// Series.java
public class Series extends Content {

    private String seriesId;
    public int totalEpisodes;

    // Constructor 1
    public Series(String title, int duration, String seriesId, int totalEpisodes) {

        super(title, duration);

        this.seriesId = seriesId;
        this.totalEpisodes = totalEpisodes;
    }

    // Constructor Overloading
    public Series(String title, String seriesId) {

        super(title);

        this.seriesId = seriesId;
        this.totalEpisodes = 1;
    }

    // Setter validation
    public void setSeriesId(String seriesId) {

        if (seriesId.startsWith("SER")) {
            this.seriesId = seriesId;
        } else {
            System.out.println("Series ID must start with SER");
        }
    }

    // Method
    public void showSeriesInfo() {

        showContentInfo();

        System.out.println("Series ID: " + seriesId);
        System.out.println("Total Episodes: " + totalEpisodes);
    }
}