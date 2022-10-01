package Class13_String_Methods_;

public class String__Questions {

    public static void main(String[] args) {

        //how would you reserve a string

        String str= "Hello";

        String newString="";

        for(int i=str.length()-1; i>=0; i--){

         newString=newString+str.charAt(i);
            System.out.println(newString);
        }

        System.out.println("------");
        //StringBuilder

        String s="Class is almost over";
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);


    }

}
