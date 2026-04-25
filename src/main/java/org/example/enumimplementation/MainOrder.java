package org.example.enumimplementation;

public class MainOrder {
    public static void main(String[] args) {

        Ordering order1 = new Ordering(
                "ORD001",
                OrderStatus.PENDING
        );

        Ordering order2 = new Ordering(
                "ORD002",
                OrderStatus.SHIPPED
        );

        Ordering order3 = new Ordering(
                "ORD003",
                OrderStatus.DELIVERED
        );

        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}
