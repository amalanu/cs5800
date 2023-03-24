package HW2.Q2;

public class Main {

    public static void main(String args[]) {

        FactoryFactory factory = new FactoryFactory();

        VehicleFactory honda = factory.getFactory("Honda", "Car");
        VehicleFactory porsche = factory.getFactory("Porsche", "Car");
        VehicleFactory tesla = factory.getFactory("Tesla", "Car");

        VehicleFactory airbus = factory.getFactory("Airbus", "Plane");
        VehicleFactory boeing = factory.getFactory("Boeing", "Plane");
        VehicleFactory embraer = factory.getFactory("Embraer", "Plane");

        honda.build();
        porsche.repair();
        tesla.restore();

        airbus.build();
        boeing.repair();
        embraer.restore();
    }
    
}
