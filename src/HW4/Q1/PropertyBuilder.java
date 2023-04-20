package HW4.Q1;

import java.util.ArrayList;
import java.util.HashMap;

public class PropertyBuilder {
    private static PropertyBuilder instance;
    private static final HashMap<ArrayList, CharacterProperties> propertyMap = new HashMap<>();

    public PropertyBuilder() {

    }

    public static PropertyBuilder getInstance() {
        if (instance == null) {
            instance = new PropertyBuilder();
        }

        return instance;
    }

    public CharacterProperties getProperties(String font, String color, int size) {
        ArrayList currentKey = new ArrayList<>();
        currentKey.add(font);
        currentKey.add(color);
        currentKey.add(size);
        CharacterProperties properties = propertyMap.get(currentKey);

        if (properties == null) {
            properties = new CharacterProperties(font, color, size);
            propertyMap.put(currentKey, properties);
        }
        
        return properties;
    }
}
