package design.patterns.structural.Bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Notification notification = new QRMessage(new SMS());
        notification.sendMessage();
    }
}
