package Class14_Methods;

public class HW2 {
   // Create a method that will take a number and prints whether the number is even or odd

    void PrintEvenOdd(int num){
        if(num%2==0){
            System.out.println(num +" "+ "is even");
        }else{
            System.out.println(num +" " +" is odd");
        }
    }

    public static void main(String[] args) {

        HW2 EvenOrOdd= new HW2();
        EvenOrOdd.PrintEvenOdd(10);

    }

}
