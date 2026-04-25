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
        delivery2.deliver();
        delivery3.deliver();
    }
}
