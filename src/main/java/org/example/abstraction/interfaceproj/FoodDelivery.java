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
}