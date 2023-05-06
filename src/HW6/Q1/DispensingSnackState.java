package HW6.Q1;

import java.util.ArrayList;

public class DispensingSnackState implements StateOfVendingMachine {

    @Override
    public void waitForMoney(VendingMachine machine) {
        
    }

    @Override
    public void insertMoney(VendingMachine machine) {
       
    }

    @Override
    public void dispenseSnack(VendingMachine machine, ArrayList<Snack> snacks, SnackDispenseHandler handler) {
        handler.handleRequest(machine.getSelection(), snacks);
        machine.setState(new IdleState());
    }
    
}
