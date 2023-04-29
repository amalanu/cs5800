package HW5.Q1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ChatServer server = ChatServer.getInstance();

        User bill = new User("Bill", server);
        User jane = new User("Jane", server);
        User alex = new User("Alex", server);

        server.registerUser(bill);
        server.registerUser(jane);
        server.registerUser(alex);

        System.out.println("////////////////////////////////////////////////");
        bill.sendMessage();
        System.out.println("////////////////////////////////////////////////");
        alex.sendMessage();

        alex.addToBlockList("Bill");

        System.out.println("////////////////////////////////////////////////");
        bill.sendMessage();

        System.out.println("////////////////////////////////////////////////");
        jane.getHistoryFromUser("Bill");

        System.out.println("////////////////////////////////////////////////");
        Iterator iter = bill.iterator(bill);
        while (iter.hasNext()) {
            ((MessageMemento) iter.next()).print();
        }

        bill.undoLastMessage();

        System.out.println("////////////////////////////////////////////////");
        jane.getHistoryFromUser("Bill");

        server.unregisterUser("Alex");


    }
    
}
