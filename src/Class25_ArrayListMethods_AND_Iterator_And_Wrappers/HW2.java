package Class25_ArrayListMethods_AND_Iterator_And_Wrappers;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

    //Create an arrayList of drinks
    //If any drink has letter "a" or "e" replace it with water

    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Water");
        drinks.add("Fanta");
        drinks.add("Lemonade");
        drinks.add("Sprite");
        drinks.add("Pepsi");

        Iterator<String>it= drinks.iterator();
        while(it.hasNext()){
            String items= it.next();
            if(items.contains("a")||items.contains("e")){
                System.out.println("Water, ");
            }else{
                System.out.println(items+ ", ");
            }
        }
    }
}
