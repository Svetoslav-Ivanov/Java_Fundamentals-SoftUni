package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            String curChar = scan.nextLine();
            char currentChar = curChar.charAt(0);
            sum +=currentChar;

        }

        System.out.printf("The sum equals: %d",sum);

    }
}
