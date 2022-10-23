package Class25_ArrayListMethods_AND_Iterator_And_Wrappers;

import java.util.ArrayList;

public class Hw3 {
    //Create an arrayList of even numbers from 1 to 500.
    // Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.print(evenNumbers + " ");
    }
}



