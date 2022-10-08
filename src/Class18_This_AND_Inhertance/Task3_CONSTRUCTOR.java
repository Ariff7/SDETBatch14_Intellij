package Class18_This_AND_Inhertance;

public class Task3_CONSTRUCTOR {
     /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    private Task3_CONSTRUCTOR(){
        System.out.println("private");
    }

    Task3_CONSTRUCTOR(String name){
        System.out.println("Default");
    }

    protected Task3_CONSTRUCTOR(int age){
        System.out.println("protected");
    }
    public Task3_CONSTRUCTOR(boolean isTrue){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3_CONSTRUCTOR();
        new Task3_CONSTRUCTOR("Thank you Lubna");
        new Task3_CONSTRUCTOR(10);
        new Task3_CONSTRUCTOR(true);
    }
}
