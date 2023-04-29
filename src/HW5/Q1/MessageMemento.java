package HW5.Q1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageMemento {
    private String sender;
    private String messageContent;
    private LocalDateTime timestamp;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public MessageMemento(Message inputMessage) {
        this.sender = inputMessage.getSender();
        this.messageContent = inputMessage.getMessageContent();
        this.timestamp = inputMessage.getTimeStamp();
    }

    public LocalDateTime getTimeStamp() {
        return this.timestamp;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public String getSender() {
        return this.sender;
    }

    public void print() {
        System.out.println();
        System.out.println("From: " + sender);
        System.out.println(dtf.format(timestamp));
        System.out.println(messageContent);
        System.out.println();
    }
    
}
