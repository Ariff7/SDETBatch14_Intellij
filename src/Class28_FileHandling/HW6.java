package Class28_FileHandling;

import java.util.LinkedHashSet;

public class HW6 {
    public static void main(String[] args) {

        LinkedHashSet<String>obj=new LinkedHashSet<>();
        obj.add("A");
        obj.add("R");
        obj.add("I");
        obj.add("F");

        String text="";

        for(var ob:obj){
            text=text+ob;

        }
        System.out.println(text);

    }
}
