package org.example.inheritance.proj1;

// Person.java
public class Person {

    private String name;
    private int age;

    // Constructor 1
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor Overloading
    public Person(String name) {
        this.name = name;
        this.age = 18; // default age
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 0");
        }
    }

    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}