package Lab_DataTypesAndVariables;
                                   // 80/100 JUDGE
import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String numberAsString = scan.nextLine();
        int number = Integer.parseInt(numberAsString);

        for (int i = 1; i <= number; i++) {
            boolean isSpecial = false;
            if (i < 10) {

                if ((i == 5) || (i == 7)) {
                    isSpecial = true;
                }

                if (isSpecial) {
                    System.out.printf("%d -> True%n", i);
                } else {
                    System.out.printf("%d -> False%n", i);
                }

            } else {
                int sum = 0;

                for (int j = 0; j < numberAsString.length(); j++) {
                    String currentNumberAsString = "" + i;
                    String currentDigitAsString = "" + currentNumberAsString.charAt(j);
                    int currentDigit = Integer.parseInt(currentDigitAsString);
                    sum += currentDigit;

                    if ((sum == 5) || (sum == 7) || (sum == 11))
                        isSpecial = true;
                }

                if (isSpecial) {
                    System.out.printf("%d -> True%n", i);
                } else {
                    System.out.printf("%d -> False%n", i);
                }
            }
        }


    }
}
