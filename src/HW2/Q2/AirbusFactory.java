package HW2.Q2;

public class AirbusFactory implements VehicleFactory {
    private static AirbusFactory instance;

    private AirbusFactory() {

    }

    public static AirbusFactory getInstance() {
        if (instance == null) {
            instance = new AirbusFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Airbus built a plane.");
    }

    @Override
    public void repair() {
        System.out.println("Airbus repaired a plane.");
    }

    @Override
    public void restore() {
        System.out.println("Airbus restored a plane.");
    }
    
}
