package Class26_Sets_and_LinkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TypesOfSets {
    public static void main(String[] args) {

        //HashHet :
        //upside: It is the fastest way to retrieve
        //Downside: it does not care about the insertion order


        HashSet<String>hasshSet=new HashSet<>();
        hasshSet.add("Mango");
        hasshSet.add("Apple");
        hasshSet.add("Kiwi");
        hasshSet.add("Orange");
        hasshSet.add("Banana");
        System.out.println(hasshSet);

        //LinkedHashSet :
        // insertion speed is same as HashSet but retirevial speeed is worse

        LinkedHashSet<String> linkeddHashSet=new LinkedHashSet<>();
        linkeddHashSet.add("Mango");
        linkeddHashSet.add("Apple");
        linkeddHashSet.add("Kiwi");
        linkeddHashSet.add("Orange");
        linkeddHashSet.add("Banana");
        linkeddHashSet.add("Apple");
        System.out.println(linkeddHashSet);



    }
}
