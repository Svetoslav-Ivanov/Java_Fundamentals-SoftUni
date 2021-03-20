package Lab_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a,b) -> Integer.compare(b,a))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
