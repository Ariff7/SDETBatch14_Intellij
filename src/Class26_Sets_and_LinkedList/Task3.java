package Class26_Sets_and_LinkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task3 {
    /*
    How can you remove all duplicates from ArrayList?
     */
    public static void main(String[] args) {


        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println("Before "+aList);
        System.out.println("After "+new LinkedHashSet<>(aList));
    }
}