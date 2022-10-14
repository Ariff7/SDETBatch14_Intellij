package Class20_MethodOverLoading;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void display(String name){
        System.out.println("His name is "+name);
    }
    private void display(String name, int age){
        System.out.println(name+ " is his name and he is "+age+ "years old");
    }
    private void display(String name, int age, String sport){
        System.out.println(name+ " is his name and he is "+age+ "years old and he plays "+sport);
    }

    public static void main(String[] args) {
        Task4 taskk4=new Task4();
        taskk4.display("Maga");
        taskk4.display("JOHN CENA ", 21);
        taskk4.display("Arif", 37, "basketball");
    }

}
