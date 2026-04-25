package org.example.inheritance.proj1;

// Person.java
public class Person {

    /**
     * Tambahin satu attribute di tiap class yang ada di proj1 folder inheritnace
     * Person, Student, Teacher
     * showing infonya di tiap" class
     * */

    private String name;
    private int age;
    private Gender gender;

    // Constructor 1
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.MALE;
    }

    // Constructor Overloading
    public Person(String name) {
        this.name = name;
        this.age = 18; // default age
        this.gender = Gender.FEMALE;
    }

    public Person() {
        this.name = "Mutia";
        this.age = 22;
        this.gender = Gender.FEMALE;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
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