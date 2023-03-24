package HW2.Q2;

public class EmbraerFactory implements VehicleFactory {
    private static EmbraerFactory instance;

    private EmbraerFactory() {

    }

    public static EmbraerFactory getInstance() {
        if (instance == null) {
            instance = new EmbraerFactory();
        }
        return instance;
    }


    @Override
    public void build() {
        System.out.println("Embraer built a plane.");
    }

    @Override
    public void repair() {
        System.out.println("Embraer repaired a plane.");
    }

    @Override
    public void restore() {
        System.out.println("Embraer restored a plane.");
    }
    
}
