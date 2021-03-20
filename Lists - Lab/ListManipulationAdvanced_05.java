package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] commandAsArray = command.split(" ");

            int number ;
            switch (commandAsArray[0]) {
                case "Contains":
                    number = Integer.parseInt(commandAsArray[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    switch (commandAsArray[1]) {

                        case "even":
                            for (Integer currentNumber : numbers) {
                                if (currentNumber % 2 == 0) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case "odd":
                            for (Integer currentNumber : numbers) {
                                if (currentNumber % 2 != 0) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            System.out.println();
                            break;

                    }
                    break;

                case "Get":
                    int sum = 0;
                    for (Integer currentNumber : numbers) {
                        sum += currentNumber;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = commandAsArray[1];
                    number = Integer.parseInt(commandAsArray[2]);

                    switch (condition) {

                        case "<":

                            for (Integer currentNumber : numbers) {
                                if (currentNumber < number) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">":

                            for (Integer currentNumber : numbers) {
                                if (currentNumber > number) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case ">=":

                            for (Integer currentNumber : numbers) {
                                if (currentNumber >= number) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case "<=":

                            for (Integer currentNumber : numbers) {
                                if (currentNumber <= number) {
                                    System.out.print(currentNumber + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }


                    break;

            }

            command = scan.nextLine();
        }

    }
}
