package Class30_ExceptionHandling;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        try{
            String name=null;
            System.out.println(name.length()); //line that contains issues
            System.out.println("Code in the try block");
        }catch(RuntimeException  e){
            System.out.println("Send email to boss that your application has some kind of issues`");
        }


        System.out.println("Some Important Lines of code 1");
        System.out.println("Some Important Lines of code 2");
        System.out.println("Some Important Lines of code 3");
        System.out.println("Some Important Lines of code 4");

        System.out.println("Some Important Lines of code 5");
        System.out.println("Some Important Lines of code 6");
        System.out.println("Some Important Lines of code 7");



    }
}
