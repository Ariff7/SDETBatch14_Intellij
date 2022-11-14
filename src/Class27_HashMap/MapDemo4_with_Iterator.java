package Class27_HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4_with_Iterator {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 1.1);
        fruit.put("Banana", 1.5);

        var allKeys = fruit.keySet(); //returns the keys in the form of a set
        System.out.println(allKeys); // [Apple, Mango, Orange, Banana]


        Iterator<String> iterator=allKeys.iterator(); //Getting an iterator on that set

        while(iterator.hasNext()){
            String item = iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }

        System.out.println(fruit); // {Apple=1.99}

        fruit.keySet().removeIf(x->x.contains("n"));
        System.out.println(fruit); // {Apple=1.99}



    }
}