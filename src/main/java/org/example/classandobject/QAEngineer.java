package org.example.classandobject;

// QAEngineer.java
public class QAEngineer {

    // Attributes
    public String level;
    public Employee employee;
    public TestCase testCase;
    public BugReport bug;

    // Constructor
    public QAEngineer(String level, Employee employee, TestCase testCase, BugReport bug) {
        this.level = level;
        this.employee = employee;
        this.testCase = testCase;
        this.bug = bug;
    }

    // Method
    public void workSummary() {

        System.out.println("\nEmployee Info:");
        employee.showEmployeeInfo();
        System.out.println("Level QA: " + level);

        System.out.println("\nAssigned Test Case:");
        testCase.showTestCase();

        System.out.println("\nReported Bug:");
        bug.showBug();
    }
}