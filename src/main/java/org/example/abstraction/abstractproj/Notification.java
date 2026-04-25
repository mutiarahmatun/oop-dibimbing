package org.example.abstraction.abstractproj;

// Notification.java
public abstract class Notification {

    // Encapsulation
    private String receiver;

    // Constructor
    public Notification(String receiver) {
        this.receiver = receiver;
    }

    // Getter
    public String getReceiver() {
        return receiver;
    }

    // Abstract Method
    public abstract void sendNotification();

    // Normal Method
    public void showReceiver() {
        System.out.println("Receiver: " + receiver);
    }
}
