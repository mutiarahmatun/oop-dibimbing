package org.example.polymorphism;

// Payment.java
public class Payment {

    private double amount;

    // Constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // Getter
    public double getAmount() {
        return amount;
    }

    // Method
    public void pay() {
        System.out.println("Processing payment...");
    }
}