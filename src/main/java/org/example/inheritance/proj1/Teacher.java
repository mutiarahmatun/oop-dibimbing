package org.example.inheritance.proj1;

// Teacher.java
public class Teacher extends Person {

    private String teacherId;
    public String subject;

    // Constructor 1
    public Teacher(String name, int age, String teacherId, String subject) {

        super(name, age);

        this.teacherId = teacherId;
        this.subject = subject;
    }

    // Constructor Overloading
    public Teacher(String name, String teacherId) {

        super(name);

        this.teacherId = teacherId;
        this.subject = "General Subject";
    }

    public void showTeacherInfo() {

        showPersonInfo();

        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}
