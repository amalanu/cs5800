package HW2.Q2;

public class BertramFactory implements VehicleFactory {
    private static BertramFactory instance;

    private BertramFactory() {

    }

    public static BertramFactory getInstance() {
        if (instance == null) {
            instance = new BertramFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Bertram built a boat.");
    }

    @Override
    public void repair() {
        System.out.println("Bertram repaired a boat.");
    }

    @Override
    public void restore() {
        System.out.println("Bertram restored a boat.");
    }
    
}
