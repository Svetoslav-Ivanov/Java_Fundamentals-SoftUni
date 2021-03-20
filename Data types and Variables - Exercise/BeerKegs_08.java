package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        double currentKegVolume;
        double biggestVolume = Double.MIN_VALUE;
        String biggestKegModel = "";


        for (int i = 0; i < lines; i++) {

            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            currentKegVolume = Math.PI * Math.pow(radius, 2) * height;

            if (currentKegVolume > biggestVolume) {
                biggestVolume = currentKegVolume;
                biggestKegModel = model;
            }

        }
        System.out.println(biggestKegModel);

    }
}
