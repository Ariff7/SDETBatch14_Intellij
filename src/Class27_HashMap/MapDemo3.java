package Class27_HashMap;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {

        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",1.1);
        fruit.put("Banana",1.5);

        System.out.println(fruit); // NO DUPLICATES, banana'1.1, will be replaced by Banana1.5
        System.out.println(fruit.get("Banana")); //1.5


        Set<String> keySet = fruit.keySet(); //returns all the keys in the form of set
        System.out.println(keySet); //[Apple, Mango, Orange, Banana]

        var values = fruit.values(); //returns the values
        System.out.println(values); //[1.99, 1.99, 4.99, 1.5]





    }
}
