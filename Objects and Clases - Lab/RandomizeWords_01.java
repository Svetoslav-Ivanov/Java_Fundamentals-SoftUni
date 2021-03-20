package Lab_ObjectsAndClases;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");
        Random randomIndex = new Random();



        for (int i = 0; i < words.length; i++) {
            int currentRandomIndex = randomIndex.nextInt(words.length);
            String currentWord = words[i];
            words[i] = words [currentRandomIndex];
            words [currentRandomIndex] = currentWord;
        }

        for (String word : words) {
            System.out.println(word);
        }


    }

}
