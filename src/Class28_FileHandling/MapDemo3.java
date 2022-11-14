package Class28_FileHandling;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14 Pro Max", 1299.99);
        items.put("Eggs", 7.99);
        items.put("Apple", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flowers", 13.99);

        Set<String> keys = items.keySet();
        for(String key:keys){
            System.out.println(key);

        }

        Collection<Double> values = items.values();
        for(Double value:values){
            System.out.println(value);
        }
    }
}
