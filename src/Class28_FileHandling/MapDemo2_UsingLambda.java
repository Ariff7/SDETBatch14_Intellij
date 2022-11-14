package Class28_FileHandling;

import java.util.HashMap;

public class MapDemo2_UsingLambda { public static void main(String[] args) {

    HashMap<String, Double> items = new HashMap<>();
    items.put("Iphone 14 Pro Max", 1299.99);
    items.put("Eggs", 7.99);
    items.put("Apple", 5.0);
    items.put("Keyboard", 100.0);
    items.put("Flowers", 13.99);


    //remove word containing l

    items.keySet().removeIf(name->name.contains("l"));
    System.out.println(items);

}
}
