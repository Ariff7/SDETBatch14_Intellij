package Class26_Sets_and_LinkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class WhenToUseSets {
    public static void main(String[] args) {

        ArrayList<Integer>numbers =new ArrayList<>();
        numbers.add(33);
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println(new LinkedHashSet<>(numbers));  //converting ArrayList to linked so no duplicates

        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>(numbers); //another way of converting
        System.out.println(linkedHashSet);

        TreeSet<Integer>treeSet=new TreeSet<>(numbers);
        System.out.println(treeSet); //prints smallest to largest

    }
}
