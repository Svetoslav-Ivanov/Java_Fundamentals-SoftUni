package Lab_DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstChar = scan.nextLine();
        String secondChar = scan.nextLine();
        String thirdChar = scan.nextLine();

        System.out.printf("%s%s%s",firstChar,secondChar,thirdChar);
    }
}
