package HW5.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class User {
    private String userName;
    private ChatServer server;
    private ChatHistory history;
    private ArrayList<String> blocklist = new ArrayList<String>();
    Scanner scnr = new Scanner(System.in);

    public User(String userName, ChatServer server) {
        this.userName = userName;
        this.server = server;
        this.history = new ChatHistory(this);
    }

    public void sendMessage() {
        Message message = new Message(this);

        System.out.println("Enter message: ");
        String messageContent = scnr.nextLine();
        message.enterMessage(messageContent);

        System.out.println("Enter recipient(s) separated by comma: ");
        String str = scnr.nextLine();
        List<String> recipients = Arrays.asList(str.split(", "));
        message.addRecipients(recipients);
        
        server.sendMessage(message);
        history.addMessage(message);

    }

    public void getMessage(Message message) {
        message.displayMessage();
    }

    public String getName() {
        return this.userName;
    }

    public void addToBlockList(String user) {
        this.blocklist.add(user);
    }

    public boolean checkBlockList(String user) {
        boolean blocked = false;
        for (int i = 0; i < blocklist.size(); i++) {
            if (blocklist.get(i).equalsIgnoreCase(user)) {
                blocked = true;
            }
        }

        return blocked;
    }

    public void undoLastMessage() {
        history.deleteLastMessage();
    }
    
    public ChatHistory geChatHistory() {
        return this.history;
    }

    public void getHistoryFromUser(String name) {
        ChatHistory otherHistory = server.getChatHistory(name);
        otherHistory.print();
    }
}
