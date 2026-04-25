package org.example.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {

        // Create Customer Object
        Customer customer1 = new Customer(
                "Mutia",
                "Jakarta Selatan"
        );

        // Create Restaurant Object
        Restaurant resto1 = new Restaurant(
                "Burger Station",
                "Cheese Burger",
                45000
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
                "Mutia",
                "Jakarta"
        );

        Restaurant resto2 = new Restaurant(
                "Burger Station",
                "Cheese Burger",
                45000
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
