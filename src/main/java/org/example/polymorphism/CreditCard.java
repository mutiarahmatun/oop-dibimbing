package org.example.polymorphism;

// CreditCard.java
public class CreditCard extends Payment {

    private String cardNumber;

    // Constructor
    public CreditCard(double amount, String cardNumber) {

        super(amount);
        this.cardNumber = cardNumber;
    }

    // Override Method
    @Override
    public void pay() {

        System.out.println("Pay using Credit Card");
        System.out.println("Amount: " + getAmount());
        System.out.println("Card Number: " + cardNumber);
    }
}