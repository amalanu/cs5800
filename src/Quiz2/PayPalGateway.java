package Quiz2;

public class PayPalGateway{

    public PayPalGateway() {
        
    }

    //This method has a different name to the equivalent methods in the other gateway classes.
    //This is to simulate the fact that they from different code bases.
    public void processPayment(int paymentAmount, String userEmail) {
        System.out.println("PayPal has processed your payment.");
    }
    
}
