package HW6.Q1;

import java.util.ArrayList;

public interface StateOfVendingMachine {
    void waitForMoney(VendingMachine machine);
    void insertMoney(VendingMachine machine);
    void dispenseSnack(VendingMachine machine, ArrayList<Snack> snacks, SnackDispenseHandler handler);

}
