package org.example.encapsulation;

// Customer.java
public class Customer {

    /**
     * Tambahin atrribute baru buat customer jenisKelamin (private)
     *
     * */

    private String customerName;
    private String address;
    private String gender;

    // Constructor
    public Customer(String customerName, String address, String gender) {
        this.customerName = customerName;
        this.address = address;
        this.gender = gender;
    }

    // Getter
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Laki-laki")  || gender.equals("Perempuan")) {
            this.gender = gender;
        } else {
            System.out.println("Gender is unknown");
        }

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