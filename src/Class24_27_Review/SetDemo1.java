package Class24_27_Review;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//Find highest number and second highest
//remove duplicates

public class SetDemo1 {
    public static void main(String[] args) {

   //we want to sort and remove duplicates from an ArrayList
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        numbers.add(10);



        Set<Integer>set=new TreeSet<>(numbers); //converting arrayList to a Set

        //one way of converting
        /*numbers.clear(); //first clear so new Data is set
        numbers.addAll(set); */

        //another way of converting
        ArrayList<Integer>numbers2=new ArrayList<>(set); //creating new arrayList
        System.out.println(numbers);






    }
}
