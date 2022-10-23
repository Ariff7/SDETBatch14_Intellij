package Class21_MethodOverRiding;

public class Task2 {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
        CreditCard a=new CreditCard();
        Visa b= new Visa();
        AX c=new AX();

        a.Calculate(500,.02);
        b.Calculate(750,.03);
        c.Calculate(1000,.04);

    }
}

class CreditCard{
    double balance;
    double interest;

   void Calculate(double balance, double interest){
       System.out.println(balance*interest);
   }
}

class Visa extends CreditCard{
    void Calculate(double balance, double interest){
        System.out.println("Visa interest and balance equals : "+balance*interest);
    }
}

class AX extends CreditCard{
    void Calculate(double balance, double interest){
        System.out.println("AX interest and balance equals : "+balance*(interest+0.1));
    }

}
