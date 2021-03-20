package Lab_Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f",calculateTotalOrderPrice(product, count));
    }


    // TODO Total price of order
    static double calculateTotalOrderPrice (String a, int b) {
        double sum = 0;

        switch (a) {
            case "coffee" :
                sum += 1.5;
                break;

            case "water":
                sum += 1;
            break;

            case "coke" :
                sum += 1.4;
            break;

            case "snacks" :
                sum += 2;
                break;
        }

        return sum*b;
    }

}
