package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        Map<Character, Integer> countChars = new LinkedHashMap<>();

        for (String string : input) {
            for (int i = 0; i < string.length(); i++) {

                if (!countChars.containsKey(string.charAt(i))){
                    countChars.put(string.charAt(i),1);
                    continue;
                }

                countChars.put(string.charAt(i), countChars.get(string.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {
            System.out.printf("%c -> %d%n",
                    entry.getKey(),entry.getValue());
        }


    }
}