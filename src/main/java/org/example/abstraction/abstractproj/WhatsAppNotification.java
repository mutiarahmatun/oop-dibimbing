package org.example.abstraction.abstractproj;

public class WhatsAppNotification extends  Notification {

    private String whatsappNumber;

    // Constructor
    public WhatsAppNotification(String receiver, String whatsappNumber) {

        super(receiver);
        this.whatsappNumber = whatsappNumber;
    }


    @Override
    public void sendNotification() {
        System.out.println("Send WhatsApp Notification");
        showReceiver();
        System.out.println("WhatsApp Number: " + whatsappNumber);
    }
}
