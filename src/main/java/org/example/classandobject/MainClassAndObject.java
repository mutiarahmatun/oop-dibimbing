package org.example.classandobject;

import java.util.Date;

// Main.java
public class MainClassAndObject {
    /**
     * Buat object Employee, bebas pake constructor yg mana aja
     * Buat object BugReport, bebas pake constructor yg mana aja
     * Copy object TestCase yang udah ada
     * Buat Object QAEngineer
     * panggil method workSummary() yang ada di class QAEngineer
     * */

    public static void main(String[] args) {

        // Create Object Employee
        Employee emp1 = new Employee(
                "Google",
                "EMP001",
                "QA Engineer",
                8000000,
                "Mutia",
                2023
        );
        //emp1.showEmployeeInfo();

       // System.out.println("==========================");
        Employee emp2 = new Employee("EMP002", "Quality Engineer");
        //emp2.showEmployeeInfo();

        //System.out.println("==========================");
        Employee emp3 = new Employee();
        //emp3.showEmployeeInfo();

        // Create Object TestCase
        TestCase tc1 = new TestCase(
                "TC001",
                "Login Feature",
                "Passed"
        );

        // Create Object Bug
        //System.out.println("==========================");
        BugReport bug1 = new BugReport(
                "BUG001",
                "High",
                "Submit button not clickable"
        );
       // bug1.showBug();

       // System.out.println("==========================");
        BugReport bug2 = new BugReport(
                "BUG002",
                "Medium",
                "25-04-2026",
                "Typo on FAQ");
       // bug2.showBug();


        //System.out.println("==========================");
        // Create Object QA Engineer
        QAEngineer qa1 = new QAEngineer(
                "Middle",
                emp1,
                tc1,
                bug1
        );

        QAEngineer qa2 = new QAEngineer(
                "Senior",
                emp2,
                tc1,
                bug2
        );

        // Call Method
        qa1.workSummary();
        System.out.println("==========================");
        qa2.workSummary();
    }
}