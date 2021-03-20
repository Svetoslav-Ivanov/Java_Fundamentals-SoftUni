package Lab_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> words =Arrays.stream(scan.nextLine().split(" "))
                .filter(w -> w.length()%2 == 0)
                .collect(Collectors.toList());

        for (String word : words) {
            System.out.println(word);
        }

    }
}
