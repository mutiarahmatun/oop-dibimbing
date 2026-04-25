package org.example.abstraction.abstractproj;

// SMSNotification.java
public class SMSNotification extends Notification {

    private String phoneNumber;

    // Constructor
    public SMSNotification(String receiver, String phoneNumber) {

        super(receiver);
        this.phoneNumber = phoneNumber;
    }

    // Override Abstract Method
    @Override
    public void sendNotification() {

        System.out.println("Send SMS Notification");
        showReceiver();
        System.out.println("Phone Number: " + phoneNumber);
    }
}