package Class27_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",1.1);
        fruit.put("Banana",1.5);

        Set<Map.Entry<String, Double>> items = fruit.entrySet();




    }
}
