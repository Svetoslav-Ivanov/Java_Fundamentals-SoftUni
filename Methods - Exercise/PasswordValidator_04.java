package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (6 <= input.length() && input.length() <= 10) {
            if (!checkSomeChar(input)) {
                if (searchingForNumbers(input) >= 2) {
                    System.out.println("Password is valid");
                }
            }

        }

        if (!(6 <= input.length() && input.length() <= 10)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (checkSomeChar(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!(searchingForNumbers(input) >= 2)) {
            System.out.println("Password must have at least 2 digits");
        }
    }


    // TODO Check a password for some char
    private static boolean checkSomeChar(String a) {
        for (int i = 0; i < a.length(); i++) {
            for (char j = 32; j < 48; j++) {
                if (a.charAt(i) == j) {
                    return true;
                }
            }
        }

        for (int i = 0; i < a.length(); i++) {
            for (char j = 58; j < 65; j++) {
                if (a.charAt(i) == j) {
                    return true;
                }
            }
        }

        for (int i = 0; i < a.length(); i++) {
            for (int j = 91; j < 97; j++) {
                if (a.charAt(i) == j) {
                    return true;
                }
            }
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > 122)
                return true;
        }


        return false;
    }

    // TODO Check a password for at least 2 digits
    static int searchingForNumbers(String a) {
        int numbersCount = 0;
        for (int i = 0; i < a.length(); i++) {
            for (char j = '0'; j < '9'; j++) {
                if (a.charAt(i) == j) {
                    numbersCount++;
                }
            }
        }
        return numbersCount;
    }


}
