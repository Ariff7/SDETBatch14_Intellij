package Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class MapWithMethod {
    public static void main(String[] args) {

     //Create a method that returns a map of characters and their count in a String

     String str=" Down by the river, late at dawn";
        System.out.println(getCount(str));

    }

    public static Map<Character,Integer>getCount(String str){
        char[]charArr=str.toCharArray();
        Map<Character,Integer>map=new HashMap<>();

        for(char c:charArr){
            if(map.get(c)==null){
                map.put(c,1);
            }else{
                int count=map.get(c);
                count=count+1;
                map.put(c,count);
            }

        }
        return map;
    }


}
