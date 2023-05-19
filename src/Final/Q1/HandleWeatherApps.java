package Final.Q1;

public interface HandleWeatherApps {
    //converts api output to int followed by "degrees"
    public String updateTemperature();
    //converts api output to "Tomorrow's weather" followed by forecast
    public String tomorrowForecast();
    //converts api output to either "No Warning" or "Warning:" followed by warning
    public String weatherWarning();
}
