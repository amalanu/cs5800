package HW2.Q2;

public class MastercraftFactory implements VehicleFactory {
    private static MastercraftFactory instance;

    private MastercraftFactory() {

    }

    public static MastercraftFactory getInstance() {
        if (instance == null) {
            instance = new MastercraftFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Mastercraft built a boat.");
    }

    @Override
    public void repair() {
        System.out.println("Mastercraft repaired a boat.");
    }

    @Override
    public void restore() {
        System.out.println("Mastercraft restored a boat.");
    }
    
}
