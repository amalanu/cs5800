package Q2;

public class Main {
    
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Marlin", 1967);
        ships[1] = new CruiseShip("Paradisio", 2001, 2500);
        ships[2] = new CargoShip("Atlas", 1992, 1500);

        for (int i = 0; i < 3; i++) {
            ships[i].print();
        }
    }
}
