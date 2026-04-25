package org.example.abstraction.interfaceproj;

// FoodDelivery.java
public class FoodDelivery implements Deliverable {

    private String restaurantName;

    // Constructor
    public FoodDelivery(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    // Override Interface Method
    @Override
    public void deliver() {
        System.out.println("Deliver food from: " + restaurantName);
    }

    @Override
    public void statusDelivery(String status) {
        System.out.println("Status delivery food from: " + restaurantName + " has been " + status);
    }
}