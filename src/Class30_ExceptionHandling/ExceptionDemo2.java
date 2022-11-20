package Class30_ExceptionHandling;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println("A");
        System.out.println("R");
        System.out.println("I");
        System.out.println("F");
        System.out.println("\n");
        justAnotherMethod(); //	at Class30_ExceptionHandling.ExceptionDemo2.main(ExceptionDemo2.java:11)

        System.out.println("M");
        System.out.println("A");
        System.out.println("G");
        System.out.println("A");

        //int[] arr = new int[-5];  //Exception in thread "main" java.lang.NegativeArraySizeException: -5

        System.out.println("Hi Arif and Maga");

    }
    public static void justAnotherMethod(){
        int[] arr = new int[-5]; //	at Class30_ExceptionHandling.ExceptionDemo2.justAnotherMethod(ExceptionDemo2.java:23)

    }
}
