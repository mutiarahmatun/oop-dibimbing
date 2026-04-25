package org.example.abstraction.implementsinterface;

// CarRide.java
public class CarRide implements RideService {

    private String carType;

    // Constructor
    public CarRide(String carType) {
        this.carType = carType;
    }

    // Override
    @Override
    public void bookRide() {

        System.out.println("Car Ride Booked");
        System.out.println("Car Type: " + carType);
    }
}