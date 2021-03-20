package Lab_Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int a = scan.nextInt();
        int b = scan.nextInt();

        switch (command) {
            case "add":
                printAdd(a, b);
                break;
            case "multiply":
                printMultiply(a, b);
                break;
            case "subtract":
                printSubtract(a, b);

                break;
            case "divide":
                printDivide(a, b);
                break;
        }
    }


//TODO Print calculation - four methods

    //TODO add method
    static void printAdd(int a, int b) {
        System.out.println(a + b);
    }

    //TODO multiply method
    static void printMultiply(int a, int b) {
        System.out.println(a * b);
    }

    // TODO subtract method
    static void printSubtract(int a, int b) {
        System.out.println(a - b);
    }

    //TODO divide method
    static void printDivide(int a, int b) {
        System.out.println(a / b);
    }

}