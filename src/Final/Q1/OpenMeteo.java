package Final.Q1;

import java.util.Random;

public class OpenMeteo {
    int min = -30;
    int max = 110;
    Random rand = new Random();

    public int temp() {
        int temp = rand.nextInt(111);
        return temp;
    }

    public String weather() {
        int weather = rand.nextInt(10);
        switch (weather) {
            case 1: 
                return "It will rain";
            case 2:
                return "It will snow";
            case 3:
                return "There will be a heatwave";
            case 4:
                return "There will be a storm";
            case 5:
                return "It will be foggy";
            default:
                return "It will be sunny";
        }
    }

    public String warning() {
        int warning = rand.nextInt(5);
        switch (warning) {
            case 1: 
                return "There will be a wildfire";
            case 2:
                return "There will be high winds";
            default:
                return "No warnings";
        }
    }
}
