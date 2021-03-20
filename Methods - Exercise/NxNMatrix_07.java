package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        printNXNMatrixOf(number);
    }


    static void printNXNMatrixOf(int a) {
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a; k++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
