package org.example.classandobject;

// Employee.java
public class Employee {

    // Attributes
    public String companyName = "Dibimbing";
    public String employeeId;
    public String role;
    public double salary;

    // buat employeename, tahun masuk kerja

    // Constructor
    public Employee(String employeeId, String role, double salary) {
        this.employeeId = employeeId;
        this.role = role;
        this.salary = salary;
    }

    // Method
    public void showEmployeeInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}