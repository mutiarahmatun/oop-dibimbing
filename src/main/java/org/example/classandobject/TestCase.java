package org.example.classandobject;

// TestCase.java
public class TestCase {

    // Attributes
    public String testCaseId;
    public String title;
    public String status;

    // Constructor
    public TestCase(String testCaseId, String title, String status) {
        this.testCaseId = testCaseId;
        this.title = title;
        this.status = status;
    }

    // Method
    public void showTestCase() {
        System.out.println("Test Case ID: " + testCaseId);
        System.out.println("Title: " + title);
        System.out.println("Status: " + status);
    }
}