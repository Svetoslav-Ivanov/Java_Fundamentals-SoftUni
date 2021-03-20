package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] commandAsArray = command.split(" ");

            int number = Integer.parseInt(commandAsArray[1]);
            switch (commandAsArray[0]) {
                case "Add":
                    numbers.add(number);
                    break;

                case "Remove":
                    numbers.remove((Integer) number);
                    break;

                case "RemoveAt":
                    numbers.remove(number);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandAsArray [2]);
                    numbers.add(index, number);
                    break;

            }

            command = scan.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
