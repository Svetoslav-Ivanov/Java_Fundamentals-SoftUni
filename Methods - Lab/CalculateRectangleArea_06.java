package Lab_Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String widthAsString = scan.nextLine();
        String lengthAsString = scan.nextLine();

        double width = Double.parseDouble(widthAsString);
        double length = Double.parseDouble(lengthAsString);

        double area = getRectangleArea(width, length);

        if (lengthAsString.contains(".") || widthAsString.contains(".")) {
            System.out.println(area);
        } else {
            System.out.println(Math.round(area));
        }


    }


    //  TODO Calculate rectangle area
    static double getRectangleArea(double a, double b) {
        return a * b;
    }


}

