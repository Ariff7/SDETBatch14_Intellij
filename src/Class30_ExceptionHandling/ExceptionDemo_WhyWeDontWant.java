package Class30_ExceptionHandling;

public class ExceptionDemo_WhyWeDontWant {
    public static void main(String[] args) {
        System.out.println("Very Important message");
        System.out.println("Very Important message... 2 ");
        System.out.println("Very Important message... 3");
        System.out.println("Very Important message... 4");


        String name=null;
        System.out.println(name.length()); //Exception in thread "main" java.lang.NullPointerException

        System.out.println("Very Important message... 5");
        System.out.println("Very Important message... 6");
        System.out.println("Very Important message... 7");

    }
}
