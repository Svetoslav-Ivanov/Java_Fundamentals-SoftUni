package Lab_TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(",\\s+");

        String input = scan.nextLine();
        StringBuilder text = new StringBuilder();
        text.append(input);

        for (String bannedWord : bannedWords) {
            while (input.contains(bannedWord)) {
                text = text.replace(text.indexOf(bannedWord),
                        text.indexOf(bannedWord) + bannedWord.length(),
                        repeatString("*", bannedWord.length()).toString());
                input = text.toString();
            }
        }

        System.out.println(text);
    }

    static StringBuilder repeatString(String string, int count) {
        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < count; i++) {
            finalString.append(string);
        }

        return finalString;
    }
}
