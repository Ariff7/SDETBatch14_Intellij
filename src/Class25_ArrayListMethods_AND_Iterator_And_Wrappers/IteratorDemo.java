package Class25_ArrayListMethods_AND_Iterator_And_Wrappers;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
     public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        //get the iterator from the list
        Iterator<String> iterator =beautyProducts.iterator();

      /*  System.out.println(iterator.hasNext()); // we have one item
        System.out.println(iterator.next()); //it gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next()); */

//this first approach is better
       while (iterator.hasNext()){
          String item= iterator.next();
          if(item.endsWith("r")){
             iterator.remove();
          }

       }

        System.out.println(beautyProducts);

       //or
        while (iterator.hasNext()){
           if(iterator.next().endsWith("r")){
              iterator.remove();
           }

        }

        System.out.println(beautyProducts);

    }
}
