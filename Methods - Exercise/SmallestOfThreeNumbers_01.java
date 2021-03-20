package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        System.out.println(getSmallestOf(firstNumber, secondNumber, thirdNumber));
    }

    // TODO Get smallest of three numbers
    static int getSmallestOf(int a, int b, int c) {
        int smallestNumber = Integer.MAX_VALUE;

        if (a < smallestNumber) {
            smallestNumber = a;
        }
        if (b < smallestNumber) {
            smallestNumber = b;
        }
        if (c < smallestNumber) {
            smallestNumber = c;
        }

        return smallestNumber;
    }
}
