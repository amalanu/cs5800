package HW3.Q1;

public class Main {
    
    public static void main(String[] args) {
        MessagingApp whatsApp = new WhatsAppMessagingApp();
        MessagingApp facebook = new FacebookMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();

        whatsApp.send(new ImageMessage());
        whatsApp.send(new TextMessage());
        whatsApp.send(new VideoMessage());
        System.out.println("");

        facebook.send(new TextMessage());
        facebook.send(new ImageMessage());
        facebook.send(new VideoMessage());
        System.out.println("");

        telegram.send(new VideoMessage());
        telegram.send(new TextMessage());
        telegram.send(new ImageMessage());
    }
}
