package org.example.encapsulation;

// Restaurant.java
public class Restaurant {

    public String restaurantName;
    protected String menuName;
    private double price;
    private String typeOrder;

    // tipe = Makanan atau minuman -> protected / private (kalau bukan ini, print tidak tersedia)

    // Constructor
    public Restaurant(String restaurantName, String menuName, double price, String typeOrder) {
        this.restaurantName = restaurantName;
        this.menuName = menuName;
        this.typeOrder = typeOrder;
        setPrice(price);
    }

    public String getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(String typeOrder) {
        if (typeOrder.equals("Makanan") || typeOrder.equals("Minuman")) {
            this.typeOrder = typeOrder;
        } else {
            System.out.println("Makanan tidak tersedia");
        }

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