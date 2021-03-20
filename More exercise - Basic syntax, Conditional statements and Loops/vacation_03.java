package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPersons = Integer.parseInt(scan.nextLine());
        String personType = scan.nextLine();
        String day = scan.nextLine();

        double price = 0;
        double totalPrice = 0;

        switch (day) {
            case "Friday":
                switch (personType) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15.00;
                        break;
                }
                break;

            case "Saturday":
                switch (personType) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20.00;
                        break;
                }
                break;

            case "Sunday":
                switch (personType) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16.00;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;

        }

        switch (personType) {
            case "Students":
                if (countPersons >= 30) {
                    totalPrice = (price * countPersons) * 0.85;
                } else {
                    totalPrice = price * countPersons;
                }
                break;

            case "Business":

                if (countPersons >= 100) {
                    countPersons -= 10;
                }

                totalPrice = countPersons * price;
                break;

            case "Regular":
                if (10 <= countPersons && countPersons <= 20) {
                    totalPrice = (price * countPersons) * 0.95;
                }else {
                    totalPrice = countPersons * price;
                }
                break;

            default:
                totalPrice = countPersons * price;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
