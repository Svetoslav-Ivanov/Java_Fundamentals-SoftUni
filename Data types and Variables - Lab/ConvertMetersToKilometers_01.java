package Lab_DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f",((double) input) / 1000);

    }
}
