package Interview_Questions;

import java.util.LinkedList;
import java.util.List;

public class Replit219 {
    public static void main(String[] args) {
        List<String>names=new LinkedList<>();
        names.add("stevenss");
        names.add("stevens");
        names.add("johnson");
        names.add("alexander");
        names.add("alex");

        List<String> query=new LinkedList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");

        List<Integer> noOfPrefix = countOnlyPrefixes(names, query);
        System.out.println(noOfPrefix);

    }
    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        List<Integer>counter = new LinkedList<>();
        int count=0;
        var iterator= names.listIterator();

        for (String prefix : query) {
            count=0;
            /*while (iterator.hasNext()) {
                var name = iterator.next();
                if (name.startsWith(prefix) && (!name.equals(prefix))) {
                    count++;
                }
            }*/
            for(String name:names){
                if(name.startsWith(prefix) && (!name.equals(prefix)) ){
                    count++;
                }
            }
            counter.add(count);

        }
        return counter;

    }
}
