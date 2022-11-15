package Class27_HashMap;

import java.util.*;

public class MapDemo_withMethod {
    public static void main(String[] args) {

     //I want a method that takes a map and returns a set containing all the keys from that map

        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1300.0);
        items.put("Iphone x",900.0);
        items.put("Iphone 11",1000.0);
        items.put("Iphone 4",200.0);
        items.put("Iphone 13",1200.0);

        /* Set<String> keys = getKeys(items);
        for (var key:keys) {
            System.out.println(key);   //return in a set
        }

        */
        ArrayList<String> keys = getKeyz(items);
        for (var key:keys) {
            System.out.println(keys);   //arraylist return
        }

        List<Double>values=getValues(items);
        System.out.println(values);
    }

    public static Set<String>getKeys(Map<String,Double> map){
        return map.keySet();    //returns in a set
    }

    public static ArrayList<String> getKeyz(Map<String,Double> variableName){
        return new ArrayList<>(variableName.keySet());     //returns in an ArrayList
    }

    public static List<Double> getValues(Map<String,Double> variableName2){
        return new ArrayList<>(variableName2.values());
    }  // return in an arrayList

}
