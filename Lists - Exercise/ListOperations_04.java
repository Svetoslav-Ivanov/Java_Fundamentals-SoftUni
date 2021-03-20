package Lists_Lab.Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("End")) {
            int number;
            int index;
            int count;


            switch (command[0]) {

                case "Add":
                    number = Integer.parseInt(command[1]);
                    numbers.add(number);
                    break;

                case "Insert":
                  number = Integer.parseInt(command[1]);
                    index = Integer.parseInt(command[2]);
                    if (index>= numbers.size()|| index<0){
                        System.out.println("Invalid index");
                        break;
                    }

                    numbers.add(index, number);
                    break;

                case "Remove":
                    index = Integer.parseInt(command[1]);
                    if (index>= numbers.size()|| index<0){
                        System.out.println("Invalid index");
                        break;
                    }
                    numbers.remove(index);
                    break;

                case "Shift":
                    count = Integer.parseInt(command[2]);

                    for (int i = 0; i <count; i++) {
                       numbers = shift(numbers, command[1]);
                    }
                    break;

            }


            command = scan.nextLine().split(" ");
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }

    static List<Integer> shift(final List<Integer> a, String direction) {
        List<Integer> finalList = new ArrayList<>();

        if (direction.equals("left")) {

            for (int i = 1; i < a.size(); i++) {
                finalList.add(a.get(i));
            }
            finalList.add(a.get(0));

        } else if (direction.equals("right")) {

            finalList.add(a.get(a.size() - 1));
            for (int i = 0; i < a.size() - 1; i++) {
                finalList.add(a.get(i));
            }

        }
        return finalList;
    }

}
