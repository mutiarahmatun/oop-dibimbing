package org.example.abstraction.abstractproj;

// EmailNotification.java
public class EmailNotification extends Notification {

    private String subject;

    // Constructor
    public EmailNotification(String receiver, String subject) {

        super(receiver);
        this.subject = subject;
    }

    // Override Abstract Method
    @Override
    public void sendNotification() {

        System.out.println("Send Email Notification");
        showReceiver();
        System.out.println("Subject: " + subject);
    }
}
