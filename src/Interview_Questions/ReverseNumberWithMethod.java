package Interview_Questions;

public class ReverseNumberWithMethod {
    public static void main(String[] args) {

        System.out.println(reverseInteger(654));
    }


    public static int reverseInteger(int N) {
        int reversed = 0;
        int temp;

        while (N != 0) {
            temp=N%10;
            N/=10;
            reversed=(reversed*10)+temp;
        }
        return  reversed;

    }
}
