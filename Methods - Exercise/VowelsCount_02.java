package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        printCountOfVowels(input);
    }


    // TODO Print count of vowels of a single string method
    static void printCountOfVowels(String a) {
        int vowelsCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (String.valueOf(a.charAt(i)).equalsIgnoreCase("a") ||
                    String.valueOf(a.charAt(i)).equalsIgnoreCase("e") ||
                    String.valueOf(a.charAt(i)).equalsIgnoreCase("i") ||
                    String.valueOf(a.charAt(i)).equalsIgnoreCase("o") ||
                    String.valueOf(a.charAt(i)).equalsIgnoreCase("u")) {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }

}
