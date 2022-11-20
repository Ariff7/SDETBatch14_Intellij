package StudyGroup;

public class df {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverse("I am a java Programmer"));
        System.out.println(reverse("Syntax is Great"));

    }
    public static String reverse(String strToRev){
        int x =strToRev.indexOf(" ");

        if(x==-1)
            return strToRev;

        return reverse(strToRev.substring(x+1)+" "+ strToRev.substring(0,x));

    }
}