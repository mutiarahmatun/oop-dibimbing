package org.example.inheritance.proj1;

// Student.java
public class Student extends Person {

    private String studentId;
    protected String major;
    private String thesisTitle;

    // Constructor 1
    public Student(String name, int age, String studentId,
                   String major, Gender gender, String thesisTitle) {

        super(name, age, gender);

        this.studentId = studentId;
        this.major = major;
        this.thesisTitle = thesisTitle;
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
        System.out.println("Thesis title: " + thesisTitle);
    }
}
