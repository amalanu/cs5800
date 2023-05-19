package Final.Q1;

import java.util.Scanner;

public class User {
    private WeatherListener subscribedServices;
    Scanner scnr = new Scanner(System.in);

    public User() {
        this.subscribedServices = new WeatherListener();
    }

    public void getCurrentInfo() {
        subscribedServices.getTemp();
        subscribedServices.getForecast();
        subscribedServices.getWarning();
    }

    public void subscribeToService(WeatherAdapter service) {
        System.out.println("Which service of " + service.getAppName() + " would you like to subscribe to?");
        System.out.println("1: Temperature Updates");
        System.out.println("2: Weather Forecasts");
        System.out.println("3: Weather Warnings");
        System.out.println("4: All Services");
        int choice = scnr.nextInt();
        switch (choice) {
            case 1:
                service.subscribe("temp", subscribedServices);
                break;
            case 2:
                service.subscribe("forecast", subscribedServices);
                break;
            case 3:
                service.subscribe("warning", subscribedServices);
                break;
            case 4:
                service.subscribe("temp", subscribedServices);
                service.subscribe("forecast", subscribedServices);
                service.subscribe("warning", subscribedServices);
                break;
            default:
                System.out.println("Invalid response");
                break;
        }
    }
}
