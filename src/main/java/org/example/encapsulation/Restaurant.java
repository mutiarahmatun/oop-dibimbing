package org.example.encapsulation;

// Restaurant.java
public class Restaurant {

    public String restaurantName;
    protected String menuName;
    private double price;

    // Constructor
    public Restaurant(String restaurantName, String menuName, double price) {
        this.restaurantName = restaurantName;
        this.menuName = menuName;
        setPrice(price);
    }

    // Getter
    public double getPrice() {
        return price;
    }

    // Setter with Validation
    public void setPrice(double price) {

        if (price <= 0) {
            System.out.println("Price must be greater than 0");
        } else {
            this.price = price;
        }
    }

    public void showMenu() {
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Menu: " + menuName);
        System.out.println("Price: " + price);
    }
}