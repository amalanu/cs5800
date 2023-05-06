package HW6.Q1;

import java.util.ArrayList;

public class IdleState implements StateOfVendingMachine{

    @Override
    public void waitForMoney(VendingMachine machine) {
        machine.setState(new WaitingForMoneyState());
    }

    @Override
    public void insertMoney(VendingMachine machine) {
        
    }

    @Override
    public void dispenseSnack(VendingMachine machine, ArrayList<Snack> snacks, SnackDispenseHandler handler) {
        
    }

}
