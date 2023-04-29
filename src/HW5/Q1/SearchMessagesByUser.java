package HW5.Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchMessagesByUser implements Iterator{
    User userToSearch;
    ChatHistory history;
    ArrayList<MessageMemento> list = new ArrayList<>();
    int index = 0;

    public SearchMessagesByUser(User userToSearch, ChatHistory history) {
        this.userToSearch = userToSearch;
        this.history = history;

        for (int i = 0; i < history.getLength(); i++) {
            String sender = history.getIndex(i).getSender();
            if (userToSearch.getName().equalsIgnoreCase(sender)) {
                list.add(history.getIndex(i));
            }
        }
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = false;
        if (index < list.size()) {
            hasNext = true;
        }

        return hasNext;
    }

    @Override
    public Object next() {
        MessageMemento memento = list.get(index);
        index++;
        return memento;
    }
    
}
