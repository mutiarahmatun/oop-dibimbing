package org.example.inheritance.proj1;

// Teacher.java
public class Teacher extends Person {

    private String teacherId;
    public String subject;
    private int yearEntry;

    // Constructor 1
    public Teacher(String name, int age, String teacherId, String subject, Gender gender, int yearEntry) {

        super(name, age, gender);

        this.teacherId = teacherId;
        this.subject = subject;
        this.yearEntry = yearEntry;
    }

    // Constructor Overloading
    public Teacher( String teacherId) {

        super();

        this.teacherId = teacherId;
        this.subject = "General Subject";
        this.yearEntry = 2011;
    }

    public void showTeacherInfo() {

        showPersonInfo();

        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
        System.out.println("Year Entry: " + yearEntry);
    }
}
