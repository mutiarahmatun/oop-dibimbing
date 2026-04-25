package org.example.inheritance.proj2;

// Content.java
public class Content {

    // Encapsulation
    private String title;
    private int duration;

    // Constructor 1
    public Content(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Constructor Overloading
    public Content(String title) {
        this.title = title;
        this.duration = 60; // default duration
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    // Setter with validation
    public void setDuration(int duration) {

        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Duration must be greater than 0");
        }
    }

    // Method
    public void showContentInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}