package org.example.abstraction.interfaceproj;

// PackageDelivery.java
public class PackageDelivery implements Deliverable {

    private String packageId;

    // Constructor
    public PackageDelivery(String packageId) {
        this.packageId = packageId;
    }

    // Override
    @Override
    public void deliver() {

        System.out.println("Deliver package ID: " + packageId);
    }

    @Override
    public void statusDelivery(String status) {
        System.out.println("Status delivery package for package ID : " + packageId + " has been " + status);
    }
}
