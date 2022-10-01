package Class13_String_Method_HWS;

public class task2_replaceAll_FindLength_alphanurermic {
    public static void main(String[] args) {

/*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        
        String str="afkjgasfKJHASDVA2383244*@#*^!$@##@";
        
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str = " + str);
        System.out.println(str.length());
        
    }
}
