package Lab_Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumbersCount = scan.nextInt();

        int[] numbers = new int[inputNumbersCount];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = numbers.length -1; i >=0 ; i--) {

            if (i == 0){
                System.out.print(numbers [i]);
                return;
            }

            System.out.print(numbers[i] + " ");

        }


    }
}
