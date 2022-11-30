package Class28_FileHandling;

import java.util.LinkedHashMap;

public class HW1 {
    public static void main(String[] args) {

        /* Create a map of a building.
       Store floor number and its associated company name.
       (Example: 1= Google, 2=Syntax etc..).
       Insert 7 entries with duplicate keys and values.
       Check how many entries you have?
       Update company on a 4th floor.
       Remove company on the 7th floor.
       Print your map.
     */


        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Apple");
        building.put(2,"Google");
        building.put(3,"Amazon");
        building.put(4,"Samsung");
        building.put(5,"Micrsoft");
        building.put(6,"Syntax");
        building.put(7,"Apple");

        System.out.println(building.size());
        building.replace(4,"Google");
        building.remove(7);
        System.out.println("New floors of "+building);


    }
}
