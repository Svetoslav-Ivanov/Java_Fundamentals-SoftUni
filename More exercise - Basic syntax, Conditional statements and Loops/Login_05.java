package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String input = scan.nextLine();


        String password = "";
        int counter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {

            password += username.charAt(i);

        }

        while (!input.equals(password)) {
            counter++;
            if (counter ==4) {
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");

                input = scan.nextLine();
        }

        System.out.printf("User %s logged in.",username);



    }
}
