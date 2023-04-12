package HW3.Q1;

public class TelegramMessagingApp implements MessagingApp{

    @Override
    public void send(MessageType message) {
        System.out.print("Telegram: ");
        message.sendMessage();
    }
    
}
