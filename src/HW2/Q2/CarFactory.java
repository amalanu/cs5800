package HW2.Q2;

public class CarFactory implements VehicleFactory{
    private static CarFactory instance;
    private String name;

    private CarFactory(String name) {
        this.name = name;
    }

    public static CarFactory getInstance(String name) {
        if (instance == null) {
            instance = new CarFactory(name);
        }
        else if ((instance.name).equals(name)) {
            instance = new CarFactory(name);
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println(name + " built a car.");
    }

    @Override
    public void repair() {
        System.out.println(name + " repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println(name + " restored a car.");
    }
    
}
