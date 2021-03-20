package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int specialNumber = scan.nextInt();
        int power = scan.nextInt();
        int index;

        while (numbers.contains(specialNumber)) {
            int indexOfSpecialNumber = numbers.indexOf(specialNumber);
            for (int i = indexOfSpecialNumber + power; i > indexOfSpecialNumber; i--) {
                if (i < numbers.size()) {
                    numbers.remove(i);
                }
            }

            index = numbers.indexOf(specialNumber) - 1;

            while (0 <= index && index != indexOfSpecialNumber - power - 1) {
                numbers.remove(index);
                index--;
            }

            numbers.remove((Integer) specialNumber);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);

    }
}
