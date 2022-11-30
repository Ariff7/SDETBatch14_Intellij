package Interview_Questions;

import java.util.Arrays;

public class Replit216b {

    /*Create an Array of size N whose elements sum to zero
       ArraySumToZero(0) ->{}
       ArraySumToZero(1) ->{0}
       ArraySumToZero(2) ->{-1,1}
       ArraySumToZero(3) ->{1,-1,0}
       ArraySumToZero(4) ->{2,-2,3,-3}
       N will be given as input to the function and function will return
       an array whose element will sum to zero.*/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(3)));

    }
    public static int[] arraySumToZero(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N ; i +=2) {
            if(i<N-1){
                arr[i] = i + 1;
                arr[i+1] = -(i + 1);
            }else{
                arr[i] = 0;
            }

        }
        return arr;
    }
}