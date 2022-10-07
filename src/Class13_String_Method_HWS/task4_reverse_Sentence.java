package Class13_String_Method_HWS;

public class task4_reverse_Sentence {
    public static void main(String[] args) {

       /*
        How would you reverse a String word by word? for example:

        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever

         */



        String str="This is sentence i want to reverse";
        String[] str1=str.split(" ");
        int value=str1.length;
        for (int i=0; i<value; i++){
            StringBuilder str2=new StringBuilder(str1[i]);
            System.out.print(str2.reverse()+" ");
        }


    }
}
