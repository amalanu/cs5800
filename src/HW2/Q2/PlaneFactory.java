package HW2.Q2;

public class PlaneFactory implements VehicleFactory {
    private static PlaneFactory instance;
    private String name;

    private PlaneFactory(String name) {
        this.name = name;
    }

    public static PlaneFactory getInstance(String name) {
        if (instance == null) {
            instance = new PlaneFactory(name);
        }
        else if ((instance.name).equals(name)) {
            instance = new PlaneFactory(name);
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println(name + " built a plane.");
    }

    @Override
    public void repair() {
        System.out.println(name + " repaired a plane.");
    }

    @Override
    public void restore() {
        System.out.println(name + " restored a plane.");
    }
    
}
