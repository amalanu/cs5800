package Q2;

public class CruiseShip extends Ship {
    protected int maxPassengers;

    public CruiseShip(String name, int year, int max) {
        super(name, year);
        setMax(max);
    }

    private void setMax(int max) {
        this.maxPassengers = max;
    }

    public int getMax() {
        return this.maxPassengers;
    }

    public void print() {
        System.out.println("Name: " + getName() + ", Passenger Capacity: " + getMax());
    }

}
