package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.next();
        String second = scan.next();

        System.out.println(getSumOfCharacters(first, second));

    }

    static int getSumOfCharacters(String a, String b) {
        int sum = 0;

        int i = 0;
        while (i < a.length() || b.length() > i) {
            int valueOfA = 1;
            int valueOfb = 1;

            if (i < a.length()) {
                valueOfA = a.charAt(i);
            }
            if (i < b.length()) {
                valueOfb = b.charAt(i);
            }
            sum += valueOfA * valueOfb;

            i++;
        }

        return sum;
    }

}
