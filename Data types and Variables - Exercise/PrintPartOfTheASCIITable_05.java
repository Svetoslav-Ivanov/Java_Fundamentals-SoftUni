package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startChar = scan.nextInt();
        int stopChar = scan.nextInt();


        for (char i = (char) startChar ; i <= stopChar ; i++) {
            System.out.print(i + " ");
        }

    }
}
