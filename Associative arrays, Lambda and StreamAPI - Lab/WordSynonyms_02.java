package Lab_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String currentWord = scan.next();
            String currentSynonym = scan.next();

            List<String> currentSynonyms = words.computeIfAbsent(currentWord, k -> new ArrayList<>());
            currentSynonyms.add(currentSynonym);

        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }


    }
}
