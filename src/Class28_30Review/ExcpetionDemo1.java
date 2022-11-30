package Class28_30Review;

public class ExcpetionDemo1 {
    public static void main(String[] args) {

        int age=15;

        if(age<18){
            throw new AgeNotAllowed("Only 18+ buddy");
        }

    }
}
