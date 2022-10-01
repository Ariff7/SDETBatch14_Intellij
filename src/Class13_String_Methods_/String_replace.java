package Class13_String_Methods_;

public class String_replace {
    public static void main(String[] args) {

        String str = " My name is Arif";
       str=str.replace("Arif", "Magamed");
        System.out.println(str);

        System.out.println("------");

        str=str.replace('n','N');
        System.out.println(str);

    }
}
