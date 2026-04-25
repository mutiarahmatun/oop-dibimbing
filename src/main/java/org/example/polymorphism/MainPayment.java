package org.example.polymorphism;

public class MainPayment {

    /**
     * Buat class baru DebitCard, inherit dari Payment
     * override method pay yg ada di class payment
     *
     * */

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

        Payment payment4 = new DebitCard(
                160000,
                "12463683"
        );

        payment1.pay();
        System.out.println();

        payment2.pay();
        System.out.println();

        payment3.pay();
        System.out.println();

        payment4.pay();
    }
}
