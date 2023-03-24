package HW2.Q2;

public class PorscheFactory implements VehicleFactory{
    private static PorscheFactory instance;

    private PorscheFactory() {

    }

    public static PorscheFactory getInstance() {
        if (instance == null) {
            instance = new PorscheFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Porsche built a car.");
    }

    @Override
    public void repair() {
        System.out.println("Porsche repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println("Porsche restored a car.");
    }
    
}
