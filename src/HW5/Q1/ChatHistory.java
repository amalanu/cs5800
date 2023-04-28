package HW5.Q1;

import java.util.ArrayList;

public class ChatHistory {
    private User user;
    ArrayList<MessageMemento> messageHistory = new ArrayList<>();

    public ChatHistory(User user) {
        this.user = user;
    }

    public void addMessage(Message message) {
        MessageMemento memento = new MessageMemento(message);
        messageHistory.add(memento);
    }

    public MessageMemento getLastMessage() {
        int lastIndex = messageHistory.size() - 1;
        return messageHistory.get(lastIndex);
    }

    public void deleteLastMessage() {
        int lastIndex = messageHistory.size() - 1;
        messageHistory.remove(lastIndex);
    }

    public void print() {
        MessageMemento current;
        System.out.println(user.getName() + "'s chat history");
        for (int i = 0; i < messageHistory.size(); i++) {
            current = messageHistory.get(i);
            current.print();
        }
    }
}