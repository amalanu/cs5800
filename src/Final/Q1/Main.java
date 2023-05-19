package Final.Q1;

public class Main {
    
    public static void main(String[] args) {
        WeatherAPI weatherAPI = new WeatherAPI();
        WeatherGov weatherGov = new WeatherGov();
        OpenMeteo openMeteo = new OpenMeteo();

        HandleWeatherAPI handleWeatherAPI = new HandleWeatherAPI(weatherAPI);
        HandleWeatherGov handleWeatherGov = new HandleWeatherGov(weatherGov);
        HandleOpenMeteo handleOpenMeteo = new HandleOpenMeteo(openMeteo);

        WeatherAdapter weatherAPIAdapter = new WeatherAdapter("WeatherAPI", handleWeatherAPI);
        WeatherAdapter weatherGovAdapter = new WeatherAdapter("WeatherGov", handleWeatherGov);
        WeatherAdapter openMeteoAdapter = new WeatherAdapter("OpenMeteo", handleOpenMeteo);

        User user = new User();
        user.subscribeToService(weatherAPIAdapter);
        user.subscribeToService(weatherGovAdapter);
        user.subscribeToService(openMeteoAdapter);

        weatherAPIAdapter.updateTemp();
        weatherAPIAdapter.updateForecast();
        weatherAPIAdapter.updateWarning();

        weatherGovAdapter.updateTemp();
        weatherGovAdapter.updateForecast();
        weatherGovAdapter.updateWarning();

        openMeteoAdapter.updateTemp();
        openMeteoAdapter.updateForecast();
        openMeteoAdapter.updateWarning();

        user.getCurrentInfo();
    }
}
