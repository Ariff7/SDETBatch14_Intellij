package Class27_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 1.1);
        fruit.put("Banana", 1.5);

        Set<String> allKeys = fruit.keySet();//Return all the keys in the form of set
        System.out.println(allKeys);
        var values = fruit.values();//return all the values in the form of a collection
        System.out.println(values);
        Iterator<String> iterator = allKeys.iterator();//getting an iterator on that set
        while (iterator.hasNext()) {
            var item = iterator.next();
            if (item.contains("n")) {
                iterator.remove();
            }
        }
        System.out.println(fruit);
        values.removeIf(price -> price < 2);
       /* while(it.hasNext()){
            var price=it.next();
            if(price<2){
                it.remove();
            }*/
    }
}