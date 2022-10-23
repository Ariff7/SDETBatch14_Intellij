package Class25_ArrayListMethods_AND_Iterator_And_Wrappers;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1 {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {

        ArrayList<String>words =new ArrayList<>();
        words.add("Steve");
        words.add("Tiger");
        words.add("Horse");
        words.add("Hello");
        words.add("Islam");

        Iterator<String> iterators = words.iterator();
        while(iterators.hasNext()){
            String word=iterators.next();
            if(word.endsWith("e")){
                iterators.remove();
            }
        }
        System.out.println(words);
    }
}
