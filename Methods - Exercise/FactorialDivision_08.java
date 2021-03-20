package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%.2f", getFactorialOfAndDivideBy(a, b));
    }


    static double getFactorialOfAndDivideBy(int a, int b) {
        double factorialOfA = 1;
        double factorialOfB = 1;

        for (int i = 1; i <= a; i++) {
            factorialOfA *= i;
        }

        for (int i = 1; i <= b; i++) {
            factorialOfB *= i;
        }

        return factorialOfA / factorialOfB;
    }


}
