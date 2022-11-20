package Interview_Questions;

public class ReverseStringSentence {
    public static void main(String[] args) {
        System.out.println(reverse("I am a java Programmer"));
        System.out.println(reverse("Syntax is Great"));
    }

    public static String reverse(String strToRev){
        // Finding the index of the whitespaces
        int x = strToRev.indexOf(" ");

        //Base condition
        if(x == -1)
            return strToRev;

        //Recursive call
        return reverse(strToRev.substring(x+1)) +" "+ strToRev.substring(0, x);
    }
}
