package Final.Q1;

public class HandleOpenMeteo implements HandleWeatherApps{
    private OpenMeteo api;

    public HandleOpenMeteo(OpenMeteo api) {
        this.api = api;
    }

    @Override
    public String updateTemperature() {
        return api.temp() + " degrees";
    }

    @Override
    public String tomorrowForecast() {
        String forecast = api.weather();
        String[] split = forecast.split("\\s+");
        if (split.length == 3) {
            return "Tomorrow's weather: " + split[2];
        }
        else if (split.length == 5) {
            return "Tomorrow's weather: " + split[4];
        }
        else {
            return "Tomorrow's weather: " + split[3];
        }
    }

    @Override
    public String weatherWarning() {
        String warning = api.warning();
        if (warning.equalsIgnoreCase("No warnings")) {
            return "No Warning";
        }
        else {
            String[] split = warning.split("\\s+");
            if (split[4].equalsIgnoreCase("wildfire")) {
                return "Warning: Wildfire";
            }
            else {
                return "Warning: High Winds";
            }
        }
    }
    
}
