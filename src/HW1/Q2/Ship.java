package HW1.Q2;

public class Ship {
    protected String shipName;
    protected int yearBuilt;

    public Ship(String name, int year) {
        setName(name);
        setYear(year);
    }

    private void setYear(int year) {
        this.yearBuilt = year;
    }

    private void setName(String name) {
        this.shipName = name;
    }

    public String getName() {
        return this.shipName;
    }

    public int getYear() {
        return this.yearBuilt;
    }

    public void print() {
        System.out.println("Name: " + getName() + ", Year Built: " + getYear());
    }
}