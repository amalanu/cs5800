package HW2.Q2;

public class SeaRayFactory implements VehicleFactory {
    private static SeaRayFactory instance;

    private SeaRayFactory() {

    }

    public static SeaRayFactory getInstance() {
        if (instance == null) {
            instance = new SeaRayFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("SeaRay built a boat.");
    }

    @Override
    public void repair() {
        System.out.println("SeaRay repaired a boat.");
    }

    @Override
    public void restore() {
        System.out.println("SeaRay restored a boat.");
    }
    
}
