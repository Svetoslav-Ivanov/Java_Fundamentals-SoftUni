package Lab_TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder character = new StringBuilder();



        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))){
                digits.append(input.charAt(i));
            } else if (Character.isLetter(input.charAt(i))){
                letters.append(input.charAt(i));
            } else {
                character.append(input.charAt(i));
            }

        }

        System.out.printf("%s%n%s%n%s%n" ,digits.toString(),letters.toString(),
                character.toString());

    }
}
