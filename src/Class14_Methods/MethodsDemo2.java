package Class14_Methods;

public class MethodsDemo2 {

    boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        MethodsDemo2 var=new MethodsDemo2();
        if(var.isEven(4)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
