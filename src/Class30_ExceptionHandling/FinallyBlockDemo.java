package Class30_ExceptionHandling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try{
           System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("This operation is not allowed");
            String name=null;
            System.out.println(name.length());
        }finally{
            System.out.println("This Block is always executed no matter what...Should be an important code");
        }
        System.out.println("hi... ");
    }
}
