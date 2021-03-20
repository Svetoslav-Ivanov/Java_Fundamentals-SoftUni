package Lists_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(number -> number < 0);

        if (!numbers.isEmpty()) {
            Collections.reverse(numbers);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}
