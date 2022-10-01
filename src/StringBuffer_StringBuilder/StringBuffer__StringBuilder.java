package StringBuffer_StringBuilder;

public class StringBuffer__StringBuilder {
    public static void main(String[] args) {

        //StringBuilder most used class new and faster

        StringBuilder variable=new StringBuilder("Today is java class ");

        //older one , slow and not used mostly

        StringBuffer variablename=new StringBuffer("Today is java class yay..");

        //convert string  to StrinBuilder
        String str="Jaava is very easy";
        StringBuilder str1=new StringBuilder(str);
        System.out.println("str1 = " + str1);

        //convert strinbuilder to string
        String newStr=str1.toString();
    }
}
