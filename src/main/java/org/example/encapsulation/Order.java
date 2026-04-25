package org.example.encapsulation;

// Order.java
public class Order {

    private String orderId;
    Customer customer;
    Restaurant restaurant;

    // Constructor
    public Order(String orderId, Customer customer, Restaurant restaurant) {
        setOrderId(orderId);
        this.customer = customer;
        this.restaurant = restaurant;
    }

    // Getter
    public String getOrderId() {
        return orderId;
    }

    // Setter with Validation
    public void setOrderId(String orderId) {

        if (orderId.startsWith("ORD")) {
            this.orderId = orderId;
        } else {
            System.out.println("Order ID must start with ORD");
        }
    }

    public void showOrderDetail() {

        System.out.println("Order ID: " + orderId);

        System.out.println("\nCustomer Info:");
        customer.showCustomer();

        System.out.println("\nRestaurant Info:");
        restaurant.showMenu();
    }
}