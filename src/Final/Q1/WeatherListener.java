package Final.Q1;

import java.util.HashMap;
import java.util.Map;

public class WeatherListener {
    private Map<String, String> temp = new HashMap<>();
    private Map<String, String> forecast = new HashMap<>();
    private Map<String, String> warning = new HashMap<>();

    public WeatherListener() {

    }

    public void update(String event, String value, String service) {
        switch (event) {
            case "temp":
                temp.put(service, value);
                break;
            case "forecast":
                forecast.put(service, value);
                break;
            case "warning":
                warning.put(service, value);
                break;
        }
    }

    //UML diagram had all of the get methods return String
    //However, I decided instead to have them print to console instead
    //As that helps me format the result better
    //I also attempted to use lambda expressions here for the first time
    public void getTemp() {
        System.out.println("Temperature: ");
        temp.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void getForecast() {
        System.out.println("Forecast: ");
        forecast.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void getWarning() {
        System.out.println("Weather Warnings: ");
        warning.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
