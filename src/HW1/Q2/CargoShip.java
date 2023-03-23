package Q2;

public class CargoShip extends Ship {
    protected int shipTonnage;

    public CargoShip(String name, int year, int tonnage) {
        super(name, year);
        setTonnage(tonnage);
    }

    private void setTonnage(int tonnage) {
        this.shipTonnage = tonnage;
    }

    public int getTonnage() {
        return this.shipTonnage;
    }

    public void print() {
        System.out.println("Name: " + getName() + ", Ship Tonnage: " + getTonnage());
    }
    
}
