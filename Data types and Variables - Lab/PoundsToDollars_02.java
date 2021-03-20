package Lab_DataTypesAndVariables;
                                  // 80/100 JUDGE
import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String poundsAsString = scan.nextLine();

        BigDecimal pounds = new BigDecimal(poundsAsString);
        BigDecimal dollars = new BigDecimal("1.31");

        BigDecimal allInDollars = pounds.multiply(dollars);
        System.out.printf("%.3f",allInDollars);
    }
}
