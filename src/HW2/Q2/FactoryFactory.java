package HW2.Q2;

//forgive the name, I couldn't think of anything better
public class FactoryFactory {
    
    public static VehicleFactory getFactory(String name, String type) {
        VehicleFactory factory = null;
        if (type.equalsIgnoreCase("Car")) {
            factory = CarFactory.getInstance(name);
        }
        else if (type.equalsIgnoreCase("Plane")) {
            factory = PlaneFactory.getInstance(name);
        }
        else {
            factory = BoatFactory.getInstance(name);
        }

        return factory;
    }
}
