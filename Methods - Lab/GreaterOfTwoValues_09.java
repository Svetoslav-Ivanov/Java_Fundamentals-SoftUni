package Lab_Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String varType = scan.nextLine();


        switch (varType) {
            case "int":
                int firstInt = Integer.parseInt(scan.nextLine());
                int secondInt = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;

            case "char":
                char firstChar = scan.nextLine().charAt(0);
                char secondChar = scan.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;

            case "string":
                String firstString = scan.nextLine();
                String secondString = scan.nextLine();
                System.out.println(getMax( firstString, secondString));
                break;

        }


    }

    // TODO getMax() of two variable values int, char, string
    //int
    static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    // char
    static char getMax(char a, char b) {
        return (char) Math.max(a, b);
    }

    // string
    static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }

}