package Quiz2;

import java.util.Scanner;

public class GatewayAdapter {
    PayPalGateway paypal;
    StripeGateway stripe;
    SquareGateway square;

    public GatewayAdapter() {
        paypal = new PayPalGateway();
        stripe = new StripeGateway();
        square = new SquareGateway();
    }

    //I am assuming that the payment gateways take the necessary info
    //as arguments rather than asking for them in the body of the methods
    //which is why I am asking for the info here
    public void makePayment(String gatewayType, Scanner scnr) {
        int paymentAmount;
        switch(gatewayType) {
            case "PayPal":
                System.out.println("Enter payment amount: ");
                paymentAmount = scnr.nextInt();
                System.out.println("Enter user email: ");
                scnr.nextLine(); //this is to compensate for an existing bug with Scanner
                String userEmail = scnr.nextLine();
                paypal.processPayment(paymentAmount, userEmail);
                break;
            case "Stripe":
                System.out.println("Enter payment amount: ");
                paymentAmount = scnr.nextInt();
                System.out.println("Enter cardholder name: ");
                scnr.nextLine(); //This is also to compensate for said bug
                String cardholderName = scnr.nextLine();
                System.out.println("Enter card number: ");
                int cardNumber = scnr.nextInt();
                System.out.println("Enter card expiration date: ");
                scnr.nextLine(); //as is this
                String expirationDate = scnr.nextLine();
                stripe.makePayment(paymentAmount, cardholderName, cardNumber, expirationDate);
                break;
            case "Square":
                System.out.println("Enter payment amount: ");
                paymentAmount = scnr.nextInt();
                System.out.println("Enter location ID: ");
                scnr.nextLine(); //and this
                String locationID = scnr.nextLine();
                square.paymentProcessor(paymentAmount, locationID);
                break;
        }
    }
}
