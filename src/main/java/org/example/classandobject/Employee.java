package org.example.classandobject;

// Employee.java
public class Employee {

    // Attributes
    public String companyName = "Dibimbing";
    public String employeeId;
    public String role;
    public double salary;
    public String employeeName;
    public int startWorkingYear;

    // buat employeename, tahun masuk kerja

    // Constructor
    public Employee(String companyName, String employeeId, String role, double salary, String employeeName, int startWorkingYear) {
        this.companyName = companyName;
        this.employeeId = employeeId;
        this.role = role;
        this.salary = salary;
        this.startWorkingYear = startWorkingYear;
        this.employeeName = employeeName;
    }


    public Employee(String employeeId, String role) {
        this.employeeId = employeeId;
        this.role = role;
        this.employeeName = "Mutmut";
        this.startWorkingYear = 2022;
        this.salary = 10000000;
    }

    public Employee() {
        this.employeeId = "EMP003";
        this.role = "Manual Tester";
        this.salary = 7000000.0;
        this.employeeName = "Putri";
        this.startWorkingYear = 2020;
    }

    // Method
    public void showEmployeeInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Role: " + role);
        System.out.println("Start Working Year: " + startWorkingYear);
        System.out.println("Salary: " + salary);
    }
}