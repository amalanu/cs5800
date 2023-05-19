package Final.Q1;

import java.util.Random;

public class WeatherAPI {
    double min = -30.00;
    double max = 110.00;
    Random rand = new Random();

    public double currentTemp() {
        double currentTemp = min + rand.nextDouble() * ((max - min) / 10);
        return currentTemp;
    }

    public String forecast() {
        int forecast = rand.nextInt(10);
        switch (forecast) {
            case 1: 
                return "Rain";
            case 2:
                return "Snow";
            case 3:
                return "Heatwave";
            case 4:
                return "Storm";
            case 5:
                return "Fog";
            default:
                return "Sunny";
        }
    }

    public String weatherWarning() {
        int forecast = rand.nextInt(5);
        switch (forecast) {
            case 1: 
                return "Flood";
            case 2:
                return "Blizzard";
            default:
                return "No Warning";
        }
    }
}
