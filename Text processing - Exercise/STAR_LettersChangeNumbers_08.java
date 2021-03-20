package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class STAR_LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> strings = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        float finalResult = 0;

        for (String string : strings) {
            char firstLetter = string.charAt(0);
            char lastLetter = string.charAt(string.length() - 1);
            double firstLetterPosition, lastLetterPosition, number, resultedNumber;

            StringBuilder numberAsString = new StringBuilder();
            for (int i = 1; i < string.length() - 1; i++) {
                numberAsString.append(string.charAt(i));
            }
            number = Integer.parseInt(String.valueOf(numberAsString));

            if (Character.isLowerCase(firstLetter)) {
                firstLetterPosition = firstLetter - 96;
                resultedNumber = number * firstLetterPosition;
            } else {
                firstLetterPosition = firstLetter - 64;
                resultedNumber = number / firstLetterPosition;
            }

            if (Character.isLowerCase(lastLetter)) {
                lastLetterPosition = lastLetter - 96;
                resultedNumber += lastLetterPosition;
            } else {
                lastLetterPosition = lastLetter - 64;
                resultedNumber -= lastLetterPosition;
            }

            finalResult += resultedNumber;

        }

        System.out.printf("%.2f%n", finalResult);

    }
}
