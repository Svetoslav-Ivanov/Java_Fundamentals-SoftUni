package Lab_Methods.Exercises_Methods;

import java.util.Scanner;

public class CharacterInRange_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char startChar =  scan.nextLine().charAt(0);
        char finalChar =  scan.nextLine().charAt(0);

        printCharsInRange(startChar,finalChar);
    }

    // TODO Printing characters in range from char to char method
    static void printCharsInRange(char a, char b) {
        if(a<b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.print((char) i + " ");
            }
        }
    }

}
