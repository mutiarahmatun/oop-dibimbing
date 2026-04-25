package org.example.polymorphism;

public class MainPayment {
    public static void main(String[] args) {

        // Polymorphism
        Payment payment1 = new CreditCard(
                500000,
                "1234-5678"
        );

        Payment payment2 = new BankTransfer(
                300000,
                "BCA"
        );

        Payment payment3 = new EWallet(
                150000,
                "GoPay"
        );

        payment1.pay();
        System.out.println();

        payment2.pay();
        System.out.println();

        payment3.pay();
    }
}
