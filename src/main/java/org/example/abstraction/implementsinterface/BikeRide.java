package org.example.abstraction.implementsinterface;

// BikeRide.java
public class BikeRide implements RideService {

    private String driverName;

    // Constructor
    public BikeRide(String driverName) {
        this.driverName = driverName;
    }

    // Override Interface Method
    @Override
    public void bookRide() {

        System.out.println("Bike Ride Booked");
        System.out.println("Driver: " + driverName);
    }
}
