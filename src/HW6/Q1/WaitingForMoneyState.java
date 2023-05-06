package HW6.Q1;

import java.util.ArrayList;

public class WaitingForMoneyState implements StateOfVendingMachine{

    @Override
    public void waitForMoney(VendingMachine machine) {
        
    }

    @Override
    public void insertMoney(VendingMachine machine) {
        machine.setState(new DispensingSnackState());
    }

    @Override
    public void dispenseSnack(VendingMachine machine, ArrayList<Snack> snacks, SnackDispenseHandler handler) {

    }

    
}
