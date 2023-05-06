package HW6.Q1;

public class Main {
    
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Snack coke = new Snack("Coke", 5.99, 3);
        Snack pepsi = new Snack("Pepsi", 5.99, 4);
        Snack cheetos = new Snack("Cheetos", 4.99, 4);
        Snack doritos = new Snack("Doritos", 4.99, 5);
        Snack kitkat = new Snack("KitKat", 2.99, 3);
        Snack snickers = new Snack("Snickers", 3.99, 1);
        
        machine.stock(coke);
        machine.stock(pepsi);
        machine.stock(cheetos);
        machine.stock(doritos);
        machine.stock(kitkat);
        machine.stock(snickers);

        machine.selectSnack();
        machine.insertMoney(4.99);
        machine.dispenseSnack();

        machine.selectSnack();
        machine.insertMoney(2.99);
        machine.dispenseSnack();

        machine.selectSnack();
        machine.insertMoney(3.99);
        machine.dispenseSnack();

        machine.selectSnack();
        machine.insertMoney(3.99);
        machine.dispenseSnack();

    }
}
