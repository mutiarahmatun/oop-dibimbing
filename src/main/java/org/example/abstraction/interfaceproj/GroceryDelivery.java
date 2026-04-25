package org.example.abstraction.interfaceproj;

// GroceryDelivery.java
public class GroceryDelivery implements Deliverable {

    private String supermarket;

    // Constructor
    public GroceryDelivery(String supermarket) {
        this.supermarket = supermarket;
    }

    // Override
    @Override
    public void deliver() {

        System.out.println("Deliver groceries from: " + supermarket);
    }

    @Override
    public void statusDelivery(String status) {
        System.out.println("Status delivery groceries from supermarket: " + supermarket + " has been " + status);
    }
}
