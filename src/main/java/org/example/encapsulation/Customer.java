package org.example.encapsulation;

// Customer.java
public class Customer {

    private String customerName;
    private String address;

    // Constructor
    public Customer(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    // Getter
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    // Setter with Logic
    public void setAddress(String address) {

        if (address == null || address.isEmpty()) {
            System.out.println("Address cannot be empty");
        } else {
            this.address = address;
        }
    }

    public void showCustomer() {
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + address);
    }
}