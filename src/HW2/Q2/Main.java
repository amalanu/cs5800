package HW2.Q2;

public class Main {

    public static void main(String args[]) {

        FactoryFactory factory = new FactoryFactory();

        VehicleFactory honda = factory.getFactory("Honda");
        VehicleFactory porsche = factory.getFactory("Porsche");
        VehicleFactory tesla = factory.getFactory("Tesla");

        VehicleFactory airbus = factory.getFactory("Airbus");
        VehicleFactory boeing = factory.getFactory("Boeing");
        VehicleFactory embraer = factory.getFactory("Embraer");

        honda.build();
        porsche.repair();
        tesla.restore();

        airbus.build();
        boeing.repair();
        embraer.restore();

        VehicleFactory tesla2 = factory.getFactory("Tesla");
        VehicleFactory airbus2 = factory.getFactory("Airbus");

        System.out.println("\n");

        tesla2.repair();
        airbus2.restore();

        System.out.println("\n");

        VehicleFactory seaRay = factory.getFactory("SeaRay");
        VehicleFactory mastercraft = factory.getFactory("Mastercraft");
        VehicleFactory bertram = factory.getFactory("Bertram");

        seaRay.build();
        mastercraft.repair();
        bertram.restore();
    }
    
}
