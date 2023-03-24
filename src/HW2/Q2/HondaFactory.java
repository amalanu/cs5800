package HW2.Q2;

public class HondaFactory implements VehicleFactory{
    private static HondaFactory instance;

    private HondaFactory() {

    }

    public static HondaFactory getInstance() {
        if (instance == null) {
            instance = new HondaFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Honda built a car.");
    }

    @Override
    public void repair() {
        System.out.println("Honda repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println("Honda restored a car.");
    }
    
}
