package Lab_Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        char b = ("" + scan.nextLine()).charAt(0);
        int c = Integer.parseInt(scan.nextLine());

        System.out.println(Math.intOperations(a, b, c));
    }


    static class Math {

        static int intOperations (int a, char b, int c) {
            switch (b) {
                case '-':
                    return a - c;
                case '+':
                    return a + c;
                case '*':
                    return a * c;
                case '/':
                    return a / c;
            }
            return 0;
        }


        static double doubleOperations(double a, char b, double c) {
            switch (b) {
                case '-':
                    return a - c;
                case '+':
                    return a + c;
                case '*':
                    return a * c;
                case '/':
                    return a / c;
            }
            return 0;
        }

    }
}
