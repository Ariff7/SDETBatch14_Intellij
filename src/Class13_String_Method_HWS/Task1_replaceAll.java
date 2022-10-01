package Class13_String_Method_HWS;

public class Task1_replaceAll {
    public static void main(String[] args) {

        //1.Create a String that will hold a sentence.
        //        Write a program to get a new String
        //        without any spaces.

        String str="We Love Java";
        str=str.replaceAll(" ","");
        System.out.println("str = " + str);

    }
}
