package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double moneySum = 0;

        while (!input.equals("Start")) {
            double insertedMoney = Double.parseDouble(input);

            if ((insertedMoney != 0.1) && (insertedMoney != 0.2)
                    && (insertedMoney != 0.5) && (insertedMoney != 1) && (insertedMoney != 2)) {
                System.out.printf("Cannot accept %.2f%n", insertedMoney);
                input = scan.nextLine();
                continue;

            } else {
                moneySum += insertedMoney;
            }

            input = scan.nextLine();
        }

        double totalPrice = 0;

        input = scan.nextLine();

        while (!input.equals("End")) {
            double price = 0;

            switch (input) {
                case "Nuts":
                    price = 2.00;
                    break;

                case "Water":
                    price = 0.70;
                    break;

                case "Crisps":
                    price = 1.50;
                    break;

                case "Soda":
                    price = 0.80;
                    break;

                case "Coke":
                    price = 1.00;
                    break;

                default:
                    System.out.println("Invalid product");
                    input = scan.nextLine();
                    continue;
            }

            moneySum -= price;

            if (moneySum < 0) {
                moneySum += price;
                System.out.println("Sorry, not enough money");
                System.out.printf("Change: %.2f", moneySum);
                return;
            }

            System.out.printf("Purchased %s%n", input);

            input = scan.nextLine();
        }

        System.out.printf("Change: %.2f", moneySum);


    }
}
