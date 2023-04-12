package HW3.Q1;

public class FacebookMessagingApp implements MessagingApp{

    @Override
    public void send(MessageType message) {
        System.out.print("Facebook: ");
        message.sendMessage();
    }
    
}
