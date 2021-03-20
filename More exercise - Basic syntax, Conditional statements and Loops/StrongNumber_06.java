package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int number = Integer.parseInt(input);
        int sum = 1;

        for (int i = 0; i < input.length(); i++) {

            String num = "" + input.charAt(i);
            int digit = Integer.parseInt(num);



            for (int j = digit; j > 0; j--) {

                sum *= j;

            }

        }

        if (sum == number){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
