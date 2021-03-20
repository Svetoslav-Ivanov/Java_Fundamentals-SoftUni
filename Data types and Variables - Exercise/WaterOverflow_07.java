package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = scan.nextInt();
        int currentLitters = 0;
        int fillLitters = 0;

        for (int i = 0; i < numberOfLines; i++) {
            currentLitters = scan.nextInt();
            fillLitters += currentLitters;

            if (fillLitters > 255) {
                System.out.println("Insufficient capacity!");
                fillLitters -= currentLitters;
            }

        }

        System.out.println(fillLitters);
    }
}
