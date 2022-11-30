package Interview_Questions;

import java.util.Scanner;

public class Replit223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


}
