package Interview_Questions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/*
Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

 */
public class Replit218 {
    public static void main(String[] args) {
        List<String>names=new LinkedList<>();
        names.add("switch");
        names.add("tv");
        names.add("switch");
        names.add("tv");
        names.add("switch");
        names.add("tv");
        names.add("phone");

        List<String>listOfNames=countDeviceNames(names);
        System.out.println(listOfNames);

    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        Map<String,Integer>map=new LinkedHashMap<>();

        for(String name:deviceNames){
            if(map.get(name)==null){
                map.put(name,1);
            }else{
                int count=map.get(name);
                String s1=name.concat(String.valueOf(count));
                if(map.get(s1)!=null){
                    while(true){
                        s1=name.concat(String.valueOf(count));
                        if(map.get(s1)==null){
                            break;
                        }
                        count++;
                    }
                    map.put(s1,count);
                }else{
                    map.put(s1,count++);
                }
            }
        }

        ArrayList<String>result=new ArrayList<>();
        result.addAll(map.keySet());

        return result;
    }

}
