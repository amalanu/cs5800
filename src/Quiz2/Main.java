package Quiz2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        GatewayAdapter adapter = new GatewayAdapter();

        System.out.println("Enter payment service: ");
        String gatewayType = scnr.nextLine();
        adapter.makePayment(gatewayType, scnr);
    }
}
