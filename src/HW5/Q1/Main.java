package HW5.Q1;

public class Main {

    public static void main(String[] args) {
        ChatServer server = ChatServer.getInstance();

        User bill = new User("Bill", server);
        User jane = new User("Jane", server);
        User alex = new User("Alex", server);

        server.registerUser(bill);
        server.registerUser(jane);
        server.registerUser(alex);

        alex.addToBlockList("Bill");
        bill.sendMessage();

        bill.sendMessage();

        jane.getHistoryFromUser("Bill");

        bill.undoLastMessage();

        jane.getHistoryFromUser("Bill");

        server.unregisterUser("Alex");


    }
    
}
