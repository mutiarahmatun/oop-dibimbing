package org.example.abstraction.abstractproj;

// PushNotification.java
public class PushNotification extends Notification {

    private String deviceType;

    // Constructor
    public PushNotification(String receiver, String deviceType) {

        super(receiver);
        this.deviceType = deviceType;
    }

    // Override Abstract Method
    @Override
    public void sendNotification() {

        System.out.println("Send Push Notification");
        showReceiver();
        System.out.println("Device: " + deviceType);
    }
}
