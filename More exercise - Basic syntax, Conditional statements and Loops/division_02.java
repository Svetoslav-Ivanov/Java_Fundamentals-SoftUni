package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class division_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int divisor=0;

        for (int i = 2; i <= 10; i++) {
            
            if (i== 4 || i == 5 || i==8 || i==9){
                continue;
            }

            if (number%i==0){
                divisor=i;
            }

        }
        
        

        if (divisor!=0){
            System.out.printf("The number is divisible by %d", divisor);
        } else {
            System.out.println("Not divisible");
        }
    }
}
