package org.example.enumimplementation;

// Order.java
public class Ordering {

    private String orderId;
    private OrderStatus status;

    // Constructor
    public Ordering(String orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    // Method
    public void showOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
    }
}
