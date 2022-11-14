package Class26_Sets_and_LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class WhySet {
    public static void main(String[] args) {

        var numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        System.out.println(numbers);

        LinkedHashSet<Integer> setNumbers=new LinkedHashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers);    //duplication not alllowed, 2nd 10, wont show
        System.out.println(new LinkedHashSet<>(setNumbers));

        HashSet<String>names=new HashSet<>();
        names.add("John");
        names.add("Arif");
        names.add("Maga");
        names.add("Arif");
        names.add("Lilly");
        System.out.println(names);//prints fast but not in order
        System.out.println(new TreeSet<>(names));  //Tree prints in chronogical order


    }
}
