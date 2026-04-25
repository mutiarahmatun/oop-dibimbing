package org.example.polymorphism;

public class DebitCard extends Payment {

    private String cardNumber;
    private String tahunBerlaku;

    // Constructor
    public DebitCard(double amount, String cardNumber) {

        super(amount);

        this.cardNumber = cardNumber;
        this.tahunBerlaku = "12/26";
    }

    // Override Method
    @Override
    public void pay() {

        System.out.println("Pay using Debit Card");
        System.out.println("Amount: " + getAmount());
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Tahun berlaku " + tahunBerlaku);
    }
}
