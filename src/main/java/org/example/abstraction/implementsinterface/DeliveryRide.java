package org.example.abstraction.implementsinterface;

// DeliveryRide.java
public class DeliveryRide implements RideService {

    private String itemName;

    // Constructor
    public DeliveryRide(String itemName) {
        this.itemName = itemName;
    }

    // Override
    @Override
    public void bookRide() {

        System.out.println("Delivery Ride Booked");
        System.out.println("Item: " + itemName);
    }
}
