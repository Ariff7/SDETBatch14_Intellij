package Class26_Sets_and_LinkedList;

import java.util.Iterator;
import java.util.TreeSet;

public class Task4 {
    /*
    Create a Set collection in which you need to add names of the countries.
     In this set we want all objects to be sorted in alphabetical order.
      Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {

        TreeSet<String>countries=new TreeSet<>();
        countries.add("Japan");
        countries.add("Africa");
        countries.add("Russia");
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Palestine");

        for(int i=0; i<countries.size(); i++){

        }
        System.out.println(countries);


        //another way
        Iterator<String>it= countries.iterator();

        while(it.hasNext()){
            String country=it.next();
            System.out.print(country+" ");
        }


    }
}
