package Final.Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAdapter {
    private String appName;
    private HandleWeatherApps handler;
    private String currentTemp;
    private String currentForecast;
    private String weatherWarning;
    private Map<String, List<WeatherListener>> listeners = new HashMap<>();
    private String currentUpdate;

    public WeatherAdapter(String appName, HandleWeatherApps handler) {
        this.appName = appName;
        this.handler = handler;
        this.listeners.put("temp", new ArrayList<>());
        this.listeners.put("forecast", new ArrayList<>());
        this.listeners.put("warning", new ArrayList<>());
    }

    public String getAppName() {
        return this.appName;
    }

    public void updateTemp() {
        currentTemp = handler.updateTemperature();
        currentUpdate = currentTemp;
        notify("temp");
    }

    public void updateForecast() {
        currentForecast = handler.tomorrowForecast();
        currentUpdate = currentForecast;
        notify("forecast");
    }

    public void updateWarning() {
        weatherWarning = handler.weatherWarning();
        currentUpdate = weatherWarning;
        notify("warning");
    }

    public void subscribe(String service, WeatherListener listener) {
        List<WeatherListener> userList = listeners.get(service);
        userList.add(listener);
    }

    public void unsubscribe(String service, WeatherListener listener) {
        List<WeatherListener> userList = listeners.get(service);
        userList.remove(listener);
    }

    public void notify(String event) {
        List<WeatherListener> userList = listeners.get(event);
        for (int i = 0; i < userList.size(); i++) {
            WeatherListener listener = userList.get(i);
            listener.update(event, currentUpdate, getAppName());
        }
    }
}
