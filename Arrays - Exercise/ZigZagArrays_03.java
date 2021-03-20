package Lab_Arrays.Exercise_Arrays;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n ; i++) {

           int firstNum = scan.nextInt();
           int secondNum = scan.nextInt();

            if (i % 2 == 0) {
                firstArr[i - 1] = secondNum;
                secondArr[i - 1] = firstNum;
            } else {
                firstArr[i - 1] = firstNum;
                secondArr[i - 1] = secondNum;
            }
        }

        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] +  " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] +  " ");
        }
    }
}
