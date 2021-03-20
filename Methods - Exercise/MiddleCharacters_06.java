package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class MiddleCharacters_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        printTheMiddleCharacter(a);
    }

    static void printTheMiddleCharacter(String a) {
        if (a.length() % 2 == 0) {
            System.out.print(a.charAt(a.length() / 2 -1));
            System.out.print(a.charAt(a.length() / 2 ));
        } else {
            System.out.println( a.charAt(a.length() / 2 ));
        }
    }

}
