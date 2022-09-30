package class13;

public class StringBuilder__ {
    public static void main(String[] args) {

        StringBuilder variableName= new StringBuilder("hello");
        System.out.println(variableName);
        variableName.reverse();
        System.out.println(variableName);

        System.out.println("\n");

        String country="USA";
        String home="USA";

        StringBuilder state= new StringBuilder("Missouri");
        StringBuilder state2= new StringBuilder("Missouri");

        //string=cant change > immutable
       // stringBuilder=can change > mutable



    }
}