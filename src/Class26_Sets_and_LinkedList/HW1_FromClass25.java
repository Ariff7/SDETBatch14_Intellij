package Class26_Sets_and_LinkedList;

import java.util.ArrayList;

public class HW1_FromClass25 {
    public static void main(String[] args) {

        /* Create an arrayList of words.
       Remove every word that ends with “e”.
     */

        ArrayList<String>words=new ArrayList<>();
        words.add("Java");
        words.add("India");
        words.add("Palestine");
        words.add("USA");
        words.add("France");
        words.add("Pakistan");
        words.add("Ukraine");

     var it=words.iterator();


     while(it.hasNext()){
         var item=it.next();
         if(item.endsWith("e")){
             it.remove();
         }
     }
        System.out.println(words);
    }
}
