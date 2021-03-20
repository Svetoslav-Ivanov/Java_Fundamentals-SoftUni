package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int finalNumber = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = startNumber; i <= finalNumber; i++) {
            System.out.print(i+" ");
            sum += i;
        }

        System.out.printf("%nSum: %d",sum);

    }
}
