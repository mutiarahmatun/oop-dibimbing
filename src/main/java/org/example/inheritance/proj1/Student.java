package org.example.inheritance.proj1;

// Student.java
public class Student extends Person {

    private String studentId;
    protected String major;

    // Constructor 1
    public Student(String name, int age, String studentId, String major) {

        super(name, age);

        this.studentId = studentId;
        this.major = major;
    }

    // Constructor Overloading
    public Student(String name, String studentId) {

        super(name);

        this.studentId = studentId;
        this.major = "Undeclared";
    }

    public void showStudentInfo() {

        showPersonInfo();

        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}
