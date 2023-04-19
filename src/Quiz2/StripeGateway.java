package Quiz2;

public class StripeGateway{

    public StripeGateway() {
        
    }
    
    //This method has a different name to the equivalent methods in the other gateway classes.
    //This is to simulate the fact that they from different code bases.
    public void makePayment(int paymentAmount, String cardholderName, int cardNumber, String expirationDate) {
        System.out.println("Stripe has processed your payment.");
    }
}
