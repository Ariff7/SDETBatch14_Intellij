package Class13_String_Methods_;

public class String_charAt____Specific_letter {
    public static void main(String[] args) {


        //returns the char value at the specified index

        String str="how are you";

        char letter= str.charAt(6);
        System.out.println(letter);

        //how to get last character
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

    }

}
