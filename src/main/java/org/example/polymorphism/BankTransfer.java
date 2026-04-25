package org.example.polymorphism;

// BankTransfer.java
public class BankTransfer extends Payment {

    private String bankName;

    // Constructor
    public BankTransfer(double amount, String bankName) {

        super(amount);
        this.bankName = bankName;
    }

    // Override Method
    @Override
    public void pay() {

        System.out.println("Pay using Bank Transfer");
        System.out.println("Amount: " + getAmount());
        System.out.println("Bank: " + bankName);
    }
}
