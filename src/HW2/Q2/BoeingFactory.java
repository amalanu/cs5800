package HW2.Q2;

public class BoeingFactory implements VehicleFactory {
    private static BoeingFactory instance;

    private BoeingFactory() {

    }

    public static BoeingFactory getInstance() {
        if (instance == null) {
            instance = new BoeingFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Boeing built a plane.");
    }

    @Override
    public void repair() {
        System.out.println("Boeing repaired a plane.");
    }

    @Override
    public void restore() {
        System.out.println("Boeing restored a plane.");
    }
    
}
