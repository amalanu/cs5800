package HW2.Q2;

//forgive the name, I couldn't think of anything better
public class FactoryFactory {
    
    public VehicleFactory getFactory(String type) {
        VehicleFactory factory = null;
        if (type.equalsIgnoreCase("Honda")) {
            factory = HondaFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("Porsche")) {
            factory = PorscheFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("Tesla")) {
            factory = TeslaFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("Airbus")) {
            factory = AirbusFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("Boeing")) {
            factory = BoeingFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("Embraer")) {
            factory = EmbraerFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("SeaRay")) {
            factory = SeaRayFactory.getInstance();
        }
        else if (type.equalsIgnoreCase("Mastercraft")) {
            factory = MastercraftFactory.getInstance();
        }
        else {
            factory = BertramFactory.getInstance();
        }

        return factory;
    }
}
