package org.example.classandobject;

// QAEngineer.java
public class QAEngineer {

    // Attributes
    public String name;
    public Employee employee;
    public TestCase testCase;
    public BugReport bug;

    // Constructor
    public QAEngineer(String name, Employee employee, TestCase testCase, BugReport bug) {
        this.name = name;
        this.employee = employee;
        this.testCase = testCase;
        this.bug = bug;
    }

    // Method
    public void workSummary() {

        System.out.println("QA Name: " + name);

        System.out.println("\nEmployee Info:");
        employee.showEmployeeInfo();

        System.out.println("\nAssigned Test Case:");
        testCase.showTestCase();

        System.out.println("\nReported Bug:");
        bug.showBug();
    }
}