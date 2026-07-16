
package Notification;
public class NotificationDemo {

    static class Notification {
        String recipientName;
        String message;

        Notification(String recipientName, String message) {
            this.recipientName = recipientName;
            this.message = message;
        }

        void sendNotification() {
            System.out.println("Sending notification...");
        }
    }

    static class EmailNotification extends Notification {

        EmailNotification(String name, String message) {
            super(name, message);
        }

        void sendNotification() {
            System.out.println("Email sent to " + recipientName + ": " + message);
        }
    }

    static class SMSNotification extends Notification {

        SMSNotification(String name, String message) {
            super(name, message);
        }

        void sendNotification() {
            System.out.println("SMS sent to " + recipientName + ": " + message);
        }
    }

    static class PushNotification extends Notification {

        PushNotification(String name, String message) {
            super(name, message);
        }

        void sendNotification() {
            System.out.println("Push Notification sent to " + recipientName + ": " + message);
        }
    }

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Rahul", "Meeting at 10 AM"),
                new SMSNotification("Amit", "OTP: 123456"),
                new PushNotification("Priya", "Order delivered")
        };

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}