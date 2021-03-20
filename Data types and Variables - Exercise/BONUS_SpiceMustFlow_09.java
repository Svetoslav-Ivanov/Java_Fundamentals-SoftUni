package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class BONUS_SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yield = scan.nextInt();
        int days = 0;
        int totalAmount = 0;

        for (int i = yield; i >= 100; i -= 10) {
            days++;
            totalAmount += i;

            if (totalAmount >= 26) {
                totalAmount -= 26;
            }

        }

        if (totalAmount >=26) {
            totalAmount -= 26;
        }

        System.out.printf("%d%n%d", days, totalAmount);

    }
}
