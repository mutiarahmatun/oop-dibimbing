package org.example.abstraction.abstractproj;

public class AbstractionRunner {
    /**
     * Buat kelas baru WhatsAppNotification, extends dari abstract class Notification
     * Implement abstract methodnya
     *
     * */
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

        Notification notif4 = new WhatsAppNotification(
                "Mutia",
                "092793928"
        );

        notif1.sendNotification();
        System.out.println();

        notif2.sendNotification();
        System.out.println();

        notif3.sendNotification();
        System.out.println();

        notif4.sendNotification();
    }
}
