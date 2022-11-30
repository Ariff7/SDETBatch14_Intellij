package Interview_Questions;

import java.util.LinkedList;
import java.util.List;
/*
Write the logic that picks largest and second largest numbers from a list add them and return the results.
 input to method is a list that contains the numbers
input [10,20,30,40]
 */

public class Replit222 {
    public static void main(String[] args) {
        List<Integer>num=new LinkedList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println(findMaxSum(num));

    }

    public static int findMaxSum(List<Integer> list) {
        int largest=0;
        int secondLargest=0;
        int total=0;

        for(Integer number:list){
            if(largest<number){
                secondLargest=largest;
                largest=number;
            }else if(secondLargest<number){
                secondLargest=number;
            }total=largest+secondLargest;
        }

        return total;
    }
}
