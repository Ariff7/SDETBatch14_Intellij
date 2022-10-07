package Class16_AccessModifiers;

public class Person {

    private String password="Pass123";
    double salary=1000;

    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println(p1.salary);
        System.out.println(p1.password);
    }

}
