package HW3.Q1;

public class WhatsAppMessagingApp implements MessagingApp{

    @Override
    public void send(MessageType message) {
        System.out.print("WhatsApp: ");
        message.sendMessage();
    }
    
}
