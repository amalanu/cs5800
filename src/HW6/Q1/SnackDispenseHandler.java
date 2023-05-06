package HW6.Q1;

import java.util.ArrayList;

public class SnackDispenseHandler {
    private SnackDispenseHandler next;
    private int index;
    
    public SnackDispenseHandler(int index, SnackDispenseHandler next) {
        this.next = next;
        this.index = index;
    }

    public void handleRequest(int num, ArrayList<Snack> snacks) {
        if (num == index) {
            snacks.get(num).dispense();
        }
        else {
            next.handleRequest(num, snacks);
        }
    }
}
