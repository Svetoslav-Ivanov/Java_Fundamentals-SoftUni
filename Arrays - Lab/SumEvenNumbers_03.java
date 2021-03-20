package Lab_Arrays;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputLine = scan.nextLine();

        String[] numbersAsString = inputLine.split(" ");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);

    }
}

/*
int [] numbers = numbersAsString.stream (scan.nextLine().split(" "))
.mapToInt(e -> Integer.parseInt(e)).toArray();
 */
