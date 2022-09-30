package String_Methods;

public class String_IndexOf__indexOfSpecificChar {
    public static void main(String[] args) {

        String str="hello";

        char letter= str.charAt(1);
        System.out.println(letter);

        //how to get last character
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        System.out.println("\n");

        int index=str.indexOf(lastCharacter);
        System.out.println(index);
        System.out.println(str.indexOf('h'));
    }
}
