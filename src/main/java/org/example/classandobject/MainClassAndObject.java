package org.example.classandobject;

// Main.java
public class MainClassAndObject {

    public static void main(String[] args) {

        // Create Object Employee
        Employee emp1 = new Employee(
                "EMP001",
                "QA Engineer",
                8000000
        );

        // Create Object TestCase
        TestCase tc1 = new TestCase(
                "TC001",
                "Login Feature",
                "Passed"
        );

        // Create Object Bug
        BugReport bug1 = new BugReport(
                "BUG001",
                "High",
                "Submit button not clickable"
        );

        // Create Object QA Engineer
        QAEngineer qa1 = new QAEngineer(
                "Mutia",
                emp1,
                tc1,
                bug1
        );

        // Call Method
        qa1.workSummary();
    }
}