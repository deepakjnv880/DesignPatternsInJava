package design.patterns.structural.Bridge;

public class Email implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending an Email");
    }
}
