package org.example.abstraction.implementsinterface;

public class ImplementsRunner {
    public static void main(String[] args) {

        // Polymorphism + Interface
        RideService ride1 = new BikeRide("Andi");

        RideService ride2 = new CarRide("SUV");

        RideService ride3 = new DeliveryRide("Laptop");

        ride1.bookRide();
        System.out.println();

        ride2.bookRide();
        System.out.println();

        ride3.bookRide();
    }
}
