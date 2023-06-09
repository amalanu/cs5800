package HW5.Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class ChatHistory implements IterableByUser{
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
        System.out.println("Last message deleted");
    }

    public int getLength() {
        return messageHistory.size();
    }

    public MessageMemento getIndex(int index) {
        return messageHistory.get(index);
    }

    public void print() {
        MessageMemento current;
        System.out.println(user.getName() + "'s chat history");
        for (int i = 0; i < messageHistory.size(); i++) {
            current = messageHistory.get(i);
            current.print();
        }
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return new SearchMessagesByUser(userToSearchWith, this);
    }
}