package Class13_String_Method_HWS;

public class task5_palindrome_or_not {
    public static void main(String[] args) {

      ////How would you check if String is palindrome or not? aba=> true Abbc =>false

        String str="abc";
        StringBuilder variable=new StringBuilder(str);
        variable.reverse();
        if(variable.toString().equals(str)){
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is not Palindrome ");
        }
    }
}
