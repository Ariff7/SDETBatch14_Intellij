package StudyGroup;

import java.util.HashMap;
import java.util.Map;

public class df {
    public static void main(String[] args) {

       HashMap<String,String> info=new HashMap<>();
        info.put("ONE","AAA");
        info.put("TWO","BBB");
        info.put("THREE","CCC");
        info.put("FOUR","DDD");
        info.put("FIVE","EEE");

        System.out.println("HashMap Before Replace : ");
        for(Map.Entry<String,String>entry: info.entrySet()){

            System.out.println(entry.getKey()+ " : "+ entry.getValue());

        }
        System.out.println("------");
        info.replace("THREE","ASEL");
        info.replace("FIVE","SUMAIR");

        System.out.println("HashMap After Replace : ");
        for(Map.Entry<String,String>entry: info.entrySet()){

            System.out.println(entry.getKey()+ " : "+ entry.getValue());

        }


    }
}
