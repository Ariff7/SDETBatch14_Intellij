package Class24_27_Review;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo__list_Iterator {



        public static void main(String[] args) {
            ArrayList<String> animals =new ArrayList<>();
            animals.add("Dog");
            animals.add("Cat");
            animals.add("Lion");
            animals.add("Monkey");
            animals.add("Tiger");
            animals.add("Panda");
            animals.add("Horse");

            ListIterator<String> stringListIterator = animals.listIterator();
            while(stringListIterator.hasNext()){
                System.out.print(stringListIterator.next()+" "); //Dog Cat Lion Monkey Tiger Panda Horse

            }

    }
}
