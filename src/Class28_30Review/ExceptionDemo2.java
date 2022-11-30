package Class28_30Review;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int age=15;

        if(age<18){
            throw new RuntimeException("Only 18+ buddy");
        }

    }
}
