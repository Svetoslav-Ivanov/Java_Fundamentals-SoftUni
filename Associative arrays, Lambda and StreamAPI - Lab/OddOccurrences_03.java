package Lab_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <String> words = Arrays.stream(scan.nextLine()
                .toLowerCase()
                .split("\\s"))
                .collect(Collectors.toList());

        LinkedHashMap <String, Integer> occurrences = new LinkedHashMap<>();

        for (String s : words) {
            Integer currentOccurrences = occurrences.computeIfAbsent(s, k -> 0);

            occurrences.put(s, currentOccurrences+1);
        }

        words = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue()%2!=0){
                words.add(entry.getKey());
            }
        }


        System.out.println(String.join(", ", words));

    }
}
