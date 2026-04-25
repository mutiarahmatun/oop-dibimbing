package org.example.abstraction.interfaceproj;

public class InterfaceRunner {
    public static void main(String[] args) {

        // Polymorphism
        Deliverable delivery1 = new FoodDelivery(
                "Burger Station"
        );

        Deliverable delivery2 = new PackageDelivery(
                "PKG001"
        );

        Deliverable delivery3 = new GroceryDelivery(
                "Hypermart"
        );

        delivery1.deliver();
        delivery1.statusDelivery("Failed");
        System.out.println("===================");

        delivery2.deliver();
        delivery2.statusDelivery("Success");
        System.out.println("===================");

        delivery3.deliver();
        delivery3.statusDelivery("Pending");
        System.out.println("===================");
    }
}
