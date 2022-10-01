package Class13_String_Methods_;

public class Class13_Review_String_Methods_Replace {
    public static void main(String[] args) {

//^ not

        String str = "fjsdkWIDBIBDWAZQLM28346%@#&*%#!$";

     str=   str.replaceAll("[^a-zA-Z]", ".");

        System.out.println("str = " + str);
        
        String str2="Batch14 is Great. Batch 14 is Great";
        String replace = str2.replaceFirst("Great", "Good only");
        System.out.println("replace = " + replace);
    }
}
