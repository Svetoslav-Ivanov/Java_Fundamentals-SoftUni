package Lab_TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strings = scan.nextLine().split("\\s+");
        StringBuilder finalString = new StringBuilder();

        for (String string : strings) {
            finalString.append(repeatString(string, string.length()));
        }
        System.out.println(finalString);

    }

    static StringBuilder repeatString(String string, int count) {
        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < count; i++) {
            finalString.append(string);
        }

        return finalString;
    }

}
