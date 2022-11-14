package Class27_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Using_ForLoop {
    public static void main(String[] args) {

        //Iterate HashMap using ForEachLoop

        Map<String, Integer> ex=new HashMap<>();
        ex.put("Arif",21);
        ex.put("Maga",6);
        ex.put("Leyli",39);
        ex.put("Aziz",44);
        ex.put("Sevinch",19);


        for(Map.Entry<String,Integer>run:ex.entrySet()){
            System.out.println(run.getKey());
            System.out.println(run.getValue());
        }

    }
}
