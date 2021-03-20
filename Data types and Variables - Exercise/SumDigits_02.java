package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numberAsString = scan.nextLine();

        int sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {

            int currentDigit = Integer.parseInt("" + numberAsString.charAt(i));
            sum += currentDigit;
        }

        System.out.println(sum);

    }
}
