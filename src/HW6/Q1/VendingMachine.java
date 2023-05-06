package HW6.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private StateOfVendingMachine state = new IdleState();
    private ArrayList<Snack> snacks = new ArrayList<>();
    private SnackDispenseHandler handler = new SnackDispenseHandler(0, new SnackDispenseHandler(1, 
                                        new SnackDispenseHandler(2, new SnackDispenseHandler(3, 
                                        new SnackDispenseHandler(4, new SnackDispenseHandler(5, null))))));
    Scanner scnr = new Scanner(System.in);
    int selection;

    public VendingMachine() {

    }

    public void stock(Snack snack) {
        snacks.add(snack);
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void selectSnack() {
        System.out.println();
        for (int i = 0; i < snacks.size(); i++) {
            System.out.println(i + ") " + snacks.get(i).getName() + "   $" + snacks.get(i).getPrice());
        }
        System.out.println("Enter number of selection: ");
        selection = scnr.nextInt();
        state.waitForMoney(this);
    }

    public int getSelection() {
        return this.selection;
    }

    public void insertMoney(double money) {
        if (money >= snacks.get(selection).getPrice() && snacks.get(selection).getQuantity() > 0) {
            state.insertMoney(this);
        }
        else {
            System.out.println("Error");
        }
    }

    public void dispenseSnack() {
        state.dispenseSnack(this, snacks, handler);
    }
    
}
