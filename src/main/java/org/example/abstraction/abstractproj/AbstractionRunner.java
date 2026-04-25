package org.example.abstraction.abstractproj;

public class AbstractionRunner {
    public static void main(String[] args) {

        // Polymorphism + Abstraction
        Notification notif1 = new EmailNotification(
                "mutia@mail.com",
                "Welcome Email"
        );

        Notification notif2 = new SMSNotification(
                "Mutia",
                "08123456789"
        );

        Notification notif3 = new PushNotification(
                "Mutia",
                "Android"
        );

        notif1.sendNotification();
        System.out.println();

        notif2.sendNotification();
        System.out.println();

        notif3.sendNotification();
    }
}
