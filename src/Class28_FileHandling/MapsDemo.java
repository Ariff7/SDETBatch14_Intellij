package Class28_FileHandling;

import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double>items=new HashMap<>();
        items.put("Iphone 14 Pro Max",1299.99);
        items.put("Eggs", 7.99);
        items.put("Apple", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flowers", 13.99);

  //remove the items if their price is more than 10

        //Lambda Faster Way
        items.values().removeIf(price -> price > 10);
        System.out.println(items);

        Iterator<Double>it=items.values().iterator(); //first we are getting a collection of values then an Iterator
        while(it.hasNext()){
            Double price=it.next();
            if(price>10){
                it.remove();
            }
        }
        System.out.println(items);



    }
}
