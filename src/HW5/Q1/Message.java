package HW5.Q1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Message {
    private User sender;
    private List<String> recipients;
    private LocalDateTime timestamp;
    private String messageContent;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Message(User sender) {
        this.sender = sender;
        timestamp = LocalDateTime.now();
    }

    public void enterMessage(String message) {
        this.messageContent = message;
    }

    public void addRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public LocalDateTime getTimeStamp() {
        return this.timestamp;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public String getSender() {
        return this.sender.getName();
    }

    public List<String> getRecipients() {
        return this.recipients;
    }

    public void displayMessage() {
        System.out.println();
        System.out.println("From: " + sender.getName());
        System.out.println(dtf.format(timestamp));
        System.out.println(messageContent);
        System.out.println();
    }
    
}
