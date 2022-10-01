package Class13_String_Methods_;

public class String_SubSting {

    public static void main(String[] args) {

        String str= "Do you want to go play basketball";

        String word=str.substring(15);
        System.out.println(word);


        String word2=str.substring(3,6);
        System.out.println(word2);


        String newString=word2.concat(word);
        System.out.println(newString);

        System.out.println(word2+word);

    }
}
