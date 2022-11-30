package Interview_Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
Complete countDuplicates method.
 This method should count how many numbers are appearing more than once and should return the count.
 Input [12,12,13,45,78,7,7] output 2
 Input [12,12,7,7,7,7,7] output 2
Input [12,120,13,45,78,17,57] output 0
Input [12,12,13,45,78,67,87] output 1
 */

public class Replit217 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(7);
        number.add(1);
        number.add(7);
        number.add(3);
        number.add(1);
        number.add(6);
        System.out.println("output : "+countDuplicates(number));

    }

    static int countDuplicates(List<Integer> numbers){
        Iterator<Integer>it=numbers.iterator();
        Iterator<Integer>it2= numbers.iterator();
        int count=0;
        while(it.hasNext()){
            var number1=it.next();
            while(it2.hasNext()){
                var number2 = it2.next();
                if(!number2.equals(number1)){
                    continue;
                }count++;
            }
        }


        return count;
    }

}
