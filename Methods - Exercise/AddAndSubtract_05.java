package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(getSumOfAndSubtract(a, b, c));
    }

    static int getSumOfAndSubtract(int a, int b, int c) {
        return a + b - c;
    }


}
