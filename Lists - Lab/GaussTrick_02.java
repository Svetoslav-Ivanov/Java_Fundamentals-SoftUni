package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        if (numbers.size() % 2 == 0) {
            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            }
        } else {
            for (int i = 0; i < numbers.size() - 1; i++) {
                numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
