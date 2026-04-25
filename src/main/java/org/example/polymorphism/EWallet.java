package org.example.polymorphism;

// EWallet.java
public class EWallet extends Payment {

    private String walletName;

    // Constructor
    public EWallet(double amount, String walletName) {

        super(amount);
        this.walletName = walletName;
    }

    // Override Method
    @Override
    public void pay() {

        System.out.println("Pay using E-Wallet");
        System.out.println("Amount: " + getAmount());
        System.out.println("Wallet: " + walletName);
    }
}