package org.example.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        /***
         * Buat class main baru
         * set up object baru untuk Customer, Restaurant, Order
         * panggil method showOrderDetail()
         *
         * */

        // Create Customer Object
        Customer customer1 = new Customer(
                "Mutia",
                "Jakarta Selatan",
                "Perempuan"
        );

        // Create Restaurant Object
        Restaurant resto1 = new Restaurant(
                "Burger Station",
                "Cheese Burger",
                45000,
                "Makanan"
        );

        // Create Order Object
        Order order1 = new Order(
                "ORD001",
                customer1,
                resto1
        );

        // Show Order Detail
        order1.showOrderDetail();

        Customer customer2 = new Customer(
                "Andra",
                "Jakarta",
                "Laki-laki"
        );

        Restaurant resto2 = new Restaurant(
                "Juice Station",
                "Orange Juice",
                45000,
                "Minuman"
        );

        Order order2 = new Order(
                "ORD002",
                customer2,
                resto2
        );

        // Test Setter Logic
        customer2.setAddress("");

        resto2.setPrice(-10000);

        order2.setOrderId("123");

        System.out.println("\nFinal Data:");
        order2.showOrderDetail();
    }
}
