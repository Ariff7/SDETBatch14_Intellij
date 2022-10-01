package Class13_String_Methods_;

import java.util.Arrays;

public class Class13_Spilt_Review {
    public static void main(String[] args) {

        //click on spilt --> alt enter

        String sentence="You are doing Amazing. You are doing Awesome! You are doing wonderfull?";
        String[] split = sentence.split("[.!?]");

        System.out.println("split = " + Arrays.toString(split));
    }
}
