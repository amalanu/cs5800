package Final.Q1;

import java.util.Random;

public class WeatherGov {
    double min = -30.00;
    double max = 110.00;
    Random rand = new Random();
    
    public String updateTemp() {
        double currentTemp = min + rand.nextDouble() * ((max - min) / 10);
        String temp = String.valueOf(currentTemp);
        return temp;
    }

    public String tomorrowWeather() {
        int forecast = rand.nextInt(10);
        switch (forecast) {
            case 1: 
                return "Rain Predicted";
            case 2:
                return "Snow Predicted";
            case 3:
                return "Heatwave Predicted";
            case 4:
                return "Storm Predicted";
            case 5:
                return "Fog Predicted";
            default:
                return "No Inclement Weather";
        }
    }

    public int weatherHazard() {
        //1 is Tornado
        //2 is Thunderstorm
        //3 is Hailstorm
        //all others are clear weather
        //it's unwieldy but i need each weather api to return differently
        return rand.nextInt(6);

    }
}
