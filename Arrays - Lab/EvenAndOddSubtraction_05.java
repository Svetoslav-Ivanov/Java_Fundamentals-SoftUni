package Lab_Arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] allNumbersAsString = scan.nextLine().split(" ");

        int oddSum = 0;
        int evenSum = 0;

        for (String currentNumAsString : allNumbersAsString) {
            int currentNumber = Integer.parseInt(currentNumAsString);

            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }

        }

        System.out.print(evenSum - oddSum);
    }
}
