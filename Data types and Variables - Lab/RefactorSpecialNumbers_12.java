package Lab_DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= input; i++) {
            int sum = 0;

            int currentNumber = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %s%n", currentNumber, Boolean.toString(isSpecialNum).toLowerCase());
            sum = 0;
            i = currentNumber;
        }

    }
}
