package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder();
        input.append(scan.nextLine());

        for (int i = 0; i < input.length() - 1; i += 0) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                input.replace(i, i + 1, "");
            } else {
                i++;
            }
        }
        System.out.println(input.toString());

    }
}
