package HW5.Q1;

import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static ChatServer instance;
    ArrayList<User> userList = new ArrayList<>();

    private ChatServer() {

    }

    public static ChatServer getInstance() {
        if (instance == null) {
            instance = new ChatServer();
        }
        
        return instance;
    }

    public void registerUser(String name) {
        User newUser = new User(name, this);
        userList.add(newUser);
    }

    public void registerUser(User newUser) {
        userList.add(newUser);
    }

    public void unregisterUser(String name) {
        for (int i = 0; i < userList.size(); i++) {
            String current = userList.get(i).getName();
            if (current.equalsIgnoreCase(name)) {
                userList.remove(i);
                break;
            }
        }
    }
    
    public void sendMessage(Message message) {
        List<String> recipients = message.getRecipients();

        for (int i = 0; i < recipients.size(); i++) {
            for (int j = 0; j < userList.size(); j++) {
                User recipient = userList.get(j);

                if (recipients.get(i).equalsIgnoreCase(recipient.getName())) {
                    
                    if (!(recipient.checkBlockList(message.getSender()))) {
                        recipient.getMessage(message);
                    }
                    else {
                        System.out.println(recipient.getName() + " has blocked you.");
                    }
                }
            }
        }
    }

    public ChatHistory getChatHistory(String name) {
        ChatHistory userHistory = null;

        for (int i = 0; i < userList.size(); i++) {
            String current = userList.get(i).getName();
            if (current.equalsIgnoreCase(name)) {
                userHistory = userList.get(i).geChatHistory();
            }
        }

        return userHistory;
    }
    
}
