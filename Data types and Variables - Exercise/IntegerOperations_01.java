package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int fourthNumber = scan.nextInt();

        int result = (firstNumber + secondNumber) / thirdNumber * fourthNumber;

        System.out.println(result);


    }
}
