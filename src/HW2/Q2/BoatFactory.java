package HW2.Q2;

public class BoatFactory implements VehicleFactory{
    private static BoatFactory instance;
    private String name;

    private BoatFactory(String name) {
        this.name = name;
    }

    public static BoatFactory getInstance(String name) {
        if (instance == null) {
            instance = new BoatFactory(name);
        }
        else if ((instance.name).equals(name)) {
            instance = new BoatFactory(name);
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println(name + " built a boat.");
    }

    @Override
    public void repair() {
        System.out.println(name + " repaired a boat.");
    }

    @Override
    public void restore() {
        System.out.println(name + " restored a boat.");
    }
}
