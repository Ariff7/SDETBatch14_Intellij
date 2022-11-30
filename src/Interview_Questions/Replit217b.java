package Interview_Questions;

import java.util.ArrayList;
import java.util.List;

public class Replit217b {
    public static void main(String[] args ){
        List<Integer>number=new ArrayList<>();
        number.add(12);
        number.add(12);
        number.add(7);
        number.add(17);
        number.add(12);
        number.add(7);
        number.add(27);
        number.add(27);
        System.out.println(countDuplicates(number));
    }
    public static int countDuplicates(List<Integer> numbers){
        int count = 0;
        int previousInt = 0;
        for(int i=0;i<numbers.size()-1;i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i).equals(numbers.get(j))){
                    if(previousInt != numbers.get(j)){
                        previousInt=numbers.get(j);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
