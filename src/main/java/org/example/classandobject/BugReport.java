package org.example.classandobject;

// BugReport.java
public class BugReport {

    // Attributes
    public String bugId;
    public String severity;
    public String description;

    // Constructor
    public BugReport(String bugId, String severity, String description) {
        this.bugId = bugId;
        this.severity = severity;
        this.description = description;
    }

    // Method
    public void showBug() {
        System.out.println("Bug ID: " + bugId);
        System.out.println("Severity: " + severity);
        System.out.println("Description: " + description);
    }
}
