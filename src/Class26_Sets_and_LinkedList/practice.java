package Class26_Sets_and_LinkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class practice {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hMapNumbers = new LinkedHashMap<Integer, String>();

        //add key-value pairs
        hMapNumbers.put(1, "One");
        hMapNumbers.put(2, "Two");
        hMapNumbers.put(3, "Three");

        /*
         * Get all mappings of HashMap using entrySet
         * method and iterate over them
         */
        for(Map.Entry<Integer, String> entry : hMapNumbers.entrySet()){

            //use getKey method to get a key from entry
            System.out.println("Key: " + entry.getKey()+ "value:"+entry.getValue());

            //use getValue method to get a value from entry
           // System.out.println("Value: " + entry.getValue());
        }


    }
}