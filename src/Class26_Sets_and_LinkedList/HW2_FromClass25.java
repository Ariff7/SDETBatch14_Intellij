package Class26_Sets_and_LinkedList;

import java.util.ArrayList;

public class HW2_FromClass25 {
    public static void main(String[] args) {
        //Create an arrayList of drinks.
        // If any drink has letter “a” or “e” replace it with water.

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Lemonade");
        drinks.add("Juice");
        drinks.add("Monster");
        drinks.add("Redbull");
        drinks.add("Milk");


        for(int i=0; i< drinks.size(); i++){
            String item= drinks.get(i);
            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
                drinks.set(i,"WATER");
            }
        }
        System.out.println(drinks);

    }
}
