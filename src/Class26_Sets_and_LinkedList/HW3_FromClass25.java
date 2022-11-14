package Class26_Sets_and_LinkedList;

import java.util.ArrayList;

public class HW3_FromClass25 {
    //Create an arrayList of even numbers from1 to 500
    //remove anyu number that is divisible by 5 from that ArrayList
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        for(int i=2; i<=500; i+=2 ){   //or i=i+2
            numbers.add(i);

        }System.out.println(numbers); //only divisble by 2

        var it=numbers.iterator();

  while(it.hasNext()){
      Integer num= it.next();
      if(num%5==0){
          it.remove();
      }
  }

        System.out.println(numbers);  //even numbers ,, also diviible by 5

    }
}
