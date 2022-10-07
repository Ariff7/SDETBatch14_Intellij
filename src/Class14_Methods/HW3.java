package Class14_Methods;

public class HW3 {

    //Create a method that will print whether given String is palindrome or not.

    void palindrome(String word) {

        StringBuilder rev = new StringBuilder(word).reverse();
        String str = rev.toString();

        if (word.equals(str)) {
            System.out.println(word + " is palindrome");
        } else  {
            System.out.println(word + " is not a palindrome");
        }

    }

    public static void main(String[] args) {
        HW3 pali=new HW3();
        pali.palindrome("BoB");
    }

}
