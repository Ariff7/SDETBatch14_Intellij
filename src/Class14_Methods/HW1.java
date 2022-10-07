package Class14_Methods;

public class HW1 {

   // Create a method that will take 2 parameters as a numbers and prints which number is larger.


//method
    void larger(int num1, int num2){
        int sum=0;
        if(num1>num2){
            System.out.println(num1 + " is the bigger number");
        }else{
            System.out.println(num2 + "is the bigger number");
        }
    }
//object
    public static void main(String[] args) {

        HW1 maxNum=new HW1();

        maxNum.larger(1,7);

    }


}
