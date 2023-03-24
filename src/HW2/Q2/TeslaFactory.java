package HW2.Q2;

public class TeslaFactory implements VehicleFactory{
    private static TeslaFactory instance;

    private TeslaFactory() {

    }

    public static TeslaFactory getInstance() {
        if (instance == null) {
            instance = new TeslaFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Tesla built a car.");
    }

    @Override
    public void repair() {
        System.out.println("Tesla repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println("Tesla restored a car.");
    }
    
}
