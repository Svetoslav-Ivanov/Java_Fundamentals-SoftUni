package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("end")) {
            int currentPassengers;

            if (command.length == 1) {

                for (int i = 0; i < wagons.size(); i++) {
                    currentPassengers = Integer.parseInt(command[0]);

                    if (currentPassengers + wagons.get(i) <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + currentPassengers);
                        break;
                    }
                }

            } else {
                currentPassengers = Integer.parseInt(command[1]);
                wagons.add(currentPassengers);
            }

            command = scan.nextLine().split(" ");
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}