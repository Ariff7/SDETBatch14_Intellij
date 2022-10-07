package Class13_String_Method_HWS;
public class task6_swap_2_Strings_w_out_temporary_variable {

    public static void main(String[] args) {
/*
How would you swap 2 strings without a temporary variable?
 */

        String str1="python";
        String str2="Java";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}

