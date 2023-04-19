package Quiz2;

public class SquareGateway {

    public SquareGateway() {
        
    }

    //This method has a different name to the equivalent methods in the other gateway classes.
    //This is to simulate the fact that they from different code bases.
    public void paymentProcessor(int paymentAmount, String locationID) {
        System.out.println("Square has processed your payment.");
    }
}
