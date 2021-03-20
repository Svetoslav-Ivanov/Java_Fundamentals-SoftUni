package Lab_TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.next();

        while (!string.equals("end")) {
            StringBuilder finalString = new StringBuilder();
            for (int i = string.length() - 1; i >= 0; i--) {
                finalString.append(string.charAt(i));
            }
            System.out.printf("%s = %s%n", string, finalString);

            string = scan.next();
        }

    }
}
