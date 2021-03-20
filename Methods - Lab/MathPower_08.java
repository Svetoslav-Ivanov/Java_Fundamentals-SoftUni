package Lab_Methods;

import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String aAsString = scan.nextLine();
        String powerAsString = scan.nextLine();

        double a = Double.parseDouble(aAsString);
        double power = Double.parseDouble(powerAsString);

        double result = getPower(a, power);

        if (powerAsString.contains(".") || aAsString.contains(".")) {
            System.out.println(result);
        } else {
            System.out.println(Math.round(result));
        }

    }



    static double getPower (double a, double power){
        return Math.pow(a,power);
    }
}
