package Class27_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Using_Lambda {

    //Iterate through HashList using Lambda
    public static void main(String[] args) {

        Map<String, Integer> ex=new HashMap<>();
        ex.put("Arif",21);
        ex.put("Maga",6);
        ex.put("Leyli",39);
        ex.put("Aziz",44);
        ex.put("Sevinch",19);

        ex.forEach((key,value)-> {
            System.out.println(key);
            System.out.println(value);
        }
        );
        }
}
