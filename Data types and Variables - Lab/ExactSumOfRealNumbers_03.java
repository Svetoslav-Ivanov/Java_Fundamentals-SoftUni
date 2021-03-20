package Lab_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n ; i++) {
            String numberAsString = scan.nextLine();
            BigDecimal number = new BigDecimal(numberAsString);
            sum = sum.add(number);
        }
        System.out.println(sum);

    }
}
