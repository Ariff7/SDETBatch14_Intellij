package Class27_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",1.1);
        fruit.put("Banana",1.5);

        Collection<Double> getValues = fruit.values();  //returns all the values -- the numbers
        System.out.println(getValues); //[1.99, 2.99, 4.99, 1.5]


        Iterator<Double> it = getValues.iterator();
        while(it.hasNext()){
            Double value = it.next();
            if(value>2){
                it.remove();
            }
        }
        System.out.println(fruit); //{Apple=1.99, Banana=1.5}

//shorter way
        fruit.values().removeIf(option->option>2);
        System.out.println(fruit);   //{Apple=1.99, Banana=1.5}





    }
}
