package Class14_Methods;

public class MethodsDemo {

    //defining a method
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java :)");
    }
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {

        MethodsDemo obj=new MethodsDemo();

        obj.printHello();  // prints Hello world & Hello Java
        obj.printWord("Hi");
        obj.printWord("GoodBye");



    }
}
