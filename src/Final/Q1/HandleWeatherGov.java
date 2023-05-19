package Final.Q1;

public class HandleWeatherGov implements HandleWeatherApps {
    private WeatherGov api;

    public HandleWeatherGov(WeatherGov api) {
        this.api = api;
    }

    @Override
    public String updateTemperature() {
        double tempDouble = Double.parseDouble(api.updateTemp());
        int tempInt = (int) tempDouble;
        return tempInt + " degrees";
    }

    @Override
    public String tomorrowForecast() {
        String forecast = api.tomorrowWeather();
        if (forecast.equalsIgnoreCase("No Inclement Weather")) {
            return "Tomorrow's weather: Sunny"; 
        }
        else {
            String[] split = forecast.split("\\s+");
            return "Tomorrow's weather: " + split[0];
        }
    }

    @Override
    public String weatherWarning() {
        int warning = api.weatherHazard();
        if (warning == 1) {
            return "Warning: Tornado";
        }
        else if (warning == 2) {
            return "Warning: Thunderstorm";
        }
        else if (warning == 3) {
            return "Warning: Hailstorm";
        }
        else {
            return "No Warning";
        }
    }
    
}
