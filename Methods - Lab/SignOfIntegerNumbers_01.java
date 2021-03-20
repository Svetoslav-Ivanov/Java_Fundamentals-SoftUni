package Lab_Methods;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     int number = Integer.parseInt(scan.nextLine());

     printNegativePositiveOrZero(number);


    }

    //TODO Print negative or positive number or 0
    static void printNegativePositiveOrZero(int a) {
        if (a < 0) {
            System.out.printf("The number %d is negative.", a);
        } else if (a == 0) {
            System.out.printf("The number %d is zero.", a);
        } else {
            System.out.printf("The number %d is positive.", a);
        }
    }


}