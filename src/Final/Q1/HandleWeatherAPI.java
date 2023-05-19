package Final.Q1;

public class HandleWeatherAPI implements HandleWeatherApps {
    private WeatherAPI api;

    public HandleWeatherAPI(WeatherAPI api) {
        this.api = api;
    }

    @Override
    public String updateTemperature() {
        int temp = (int) api.currentTemp();
        return String.valueOf(temp) + " degrees";
    }

    @Override
    public String tomorrowForecast() {
        String forecast = api.forecast();
        return "Tomorrow's weather: " + forecast;
    }

    @Override
    public String weatherWarning() {
        String warning = api.weatherWarning();
        if (warning.equalsIgnoreCase("No Warning")) {
            return warning;
        }
        else {
            return "Warning: " + warning;
        }
    }
    
}
