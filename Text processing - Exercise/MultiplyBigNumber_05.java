package Lab_TextProcessing.Excercise_TextProcessing;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        int digit = Integer.parseInt(scan.nextLine());
        if (digit == 0) {
            System.out.println(0);
            return;
        }

        System.out.println(multiply(number, digit));
    }

    private static String multiply(String num1, int num2) {

        StringBuilder finalResult = new StringBuilder();
        List<Integer> resultAsList = new ArrayList<>();
        int multiplicationResult = 0;
        StringBuilder inputNum1 = new StringBuilder();
        inputNum1.append(num1);

        while (inputNum1.charAt(0) == '0') {
            inputNum1.replace(0, 1, "");
        }
        num1 = String.valueOf(inputNum1);

        int extra = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digitA = Integer.parseInt("" + num1.charAt(i));

            multiplicationResult = digitA * num2;
            multiplicationResult += extra;


            if (multiplicationResult > 9) {
                resultAsList.add(0, multiplicationResult % 10);
                extra = multiplicationResult / 10;
            } else {
                resultAsList.add(0, multiplicationResult);
                extra = 0;
            }

        }

        if (extra != 0) {
            resultAsList.add(0,
                    Integer.parseInt("" + String.valueOf(multiplicationResult).charAt(0)));
        }

        for (Integer integer : resultAsList) {
            finalResult.append(integer);
        }

        return String.valueOf(finalResult);
    }
}
