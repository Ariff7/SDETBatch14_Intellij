package Class27_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Using_Iterator {
    public static void main(String[] args) {
        //1.) Iterate through a HashMap EntrySet using Iterator
        Map<String, Integer>ex=new HashMap<>();
        ex.put("Arif",21);
        ex.put("Maga",6);
        ex.put("Leyli",39);
        ex.put("Aziz",44);
        ex.put("Sevinch",19);

        Iterator<Map.Entry<String, Integer>> it = ex.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue()+ " ");
        }

        //USING KEYSET below

        Iterator<String> it2 = ex.keySet().iterator();
        while(it2.hasNext()){
            String key = it2.next();
            System.out.println(key); //will only print names
            System.out.println(ex.get(key)+" "); //will print names and age

        }

    }
}
