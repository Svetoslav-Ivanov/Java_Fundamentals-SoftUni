package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();


        while (!(command.equalsIgnoreCase("end"))) {
            System.out.println(searchForPalindrome(command));
            command = scan.nextLine();
        }

    }

    static boolean searchForPalindrome(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        return a.equals(b);

    }
}
