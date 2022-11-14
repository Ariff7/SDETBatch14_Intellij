package Class27_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_UsingStreamAPI {

    //Looop through HashMap using StreamApi

    public static void main(String[] args) {
        Map<String, Integer> ex=new HashMap<>();
        ex.put("Arif",21);
        ex.put("Maga",6);
        ex.put("Leyli",39);
        ex.put("Aziz",44);
        ex.put("Sevinch",19);

        ex.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });



    }
}
