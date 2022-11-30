package Interview_Questions;

import java.util.LinkedList;
import java.util.List;

public class Replit219b {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");

        List<String>query=new LinkedList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");

        List<Integer> noOfPrefix = countOnlyPrefixes(names, query);
        System.out.println(noOfPrefix);
    }
    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        var counter = new LinkedList<Integer>();
        int count=0;
        var iterator= names.listIterator();

        for (String prefix : query) {
            count=0;
            for(String name:names)
                if (name.startsWith(prefix) && (!name.equals(prefix))) count++;
            counter.add(count);
        }
        return counter;
    }
}
