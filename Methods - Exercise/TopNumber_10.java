package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        printMasterNumbersFromZeroTo(n);

    }


    static void printMasterNumbersFromZeroTo(int a) {
        for (int i = 0; i < a; i++) {
            if (checkIfSumOfDigitsIsDivisibleOf(i, 8) && checkForOddDigit(i)) {
                System.out.println(i);
            }
        }
    }


    static boolean checkIfSumOfDigitsIsDivisibleOf(int a, int b) {
        int sum = 0;
        for (; a > 0; a /= 10) {

            sum += a % 10;
        }

        return sum % 8 == 0;
    }

    static boolean checkForOddDigit(int a) {
        int currentDigit;

        for (; a > 0; a /= 10) {

            currentDigit = a % 10;
            if (currentDigit % 2 != 0) {
                return true;
            }
        }
        return false;
    }


}
