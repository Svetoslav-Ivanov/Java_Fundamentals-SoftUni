package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String originalText = scan.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < originalText.length(); i++) {
            encryptedText.append((char) (originalText.charAt(i) + 3));
        }
        System.out.println(encryptedText);
    }
}
