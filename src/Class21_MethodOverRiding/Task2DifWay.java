package Class21_MethodOverRiding;

public class Task2DifWay {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */

}
class CreditCard2{
    double balance;
    double interest;

    CreditCard2(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    void CalculateInterest(){
        double interestAmount=interest*balance/100;
        System.out.println("Interest amount :"+interestAmount);
    }
}
class Visa2 extends CreditCard2{
    Visa2(double balance, double interest){
        super(balance, interest);
        System.out.println("--------");
        System.out.println("Interest amount : "+(interest+5));
    }
}
class AX2 extends CreditCard2{
    AX2(double balance, double interest){
        super(balance, interest);
        System.out.println("--------");
        System.out.println("Interest amount : "+(interest+10));
    }


}