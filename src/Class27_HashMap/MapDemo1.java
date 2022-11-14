package Class27_HashMap;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String,Double>fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);


        System.out.println(fruit);  // { Apple=1.99, Mango=2.99, Orange=4.99, Banana=10.1 }
        System.out.println(fruit.get("Orange")); //4.99

        fruit.remove("Mango");
        System.out.println(fruit);  //will not show Mango

        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsKey("Watermelon"));
        System.out.println(fruit.containsValue(4.99));
        System.out.println(fruit.isEmpty());

        fruit.replace("Apple",2.99); //apple will be 2.99 instead of 1.99
        System.out.println(fruit);

    }
}
