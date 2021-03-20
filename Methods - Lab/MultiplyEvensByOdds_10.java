package Lab_Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        printMultiplyOf(getSumOfEvenNumbers(number), getSumOfOddNumbers(number));


    }


    // TODO Get sum of even or odd numbers from a integer number method
    // even
    static int getSumOfEvenNumbers(int a) {
        int currentNumber = a;
        int currentDigit = 0;
        int evenSum = 0;

        if (a > 0) {
            while (currentNumber > 0) {
                currentDigit = currentNumber % 10;
                if (currentDigit % 2 == 0) {
                    evenSum += currentDigit;
                }
                currentNumber /= 10;
            }
            return evenSum;
        } else {
            while (currentNumber < 0) {
                currentDigit = currentNumber % 10;
                if (currentDigit % 2 == 0) {
                    evenSum += currentDigit;
                }
                currentNumber /= 10;
            }
            return -evenSum;
        }

    }

    // odd
    static int getSumOfOddNumbers(int a) {
        int currentNumber = a;
        int currentDigit = 0;
        int oddSum = 0;
        if (a > 0) {
            while (currentNumber > 0) {
                currentDigit = currentNumber % 10;
                if (currentDigit % 2 != 0) {
                    oddSum += currentDigit;
                }
                currentNumber /= 10;
            }
            return oddSum;
        } else {
            while (currentNumber < 0) {
                currentDigit = currentNumber % 10;
                if (currentDigit % 2 != 0) {
                    oddSum += currentDigit;
                }
                currentNumber /= 10;
            }
            return -oddSum;
        }
    }


    //TODO multiply method
    static void printMultiplyOf(int a, int b) {
        System.out.println(a * b);
    }

}

