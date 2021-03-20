package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scan.nextLine().split(" ");


        while (!command[0].equals("end")) {
            int element = Integer.parseInt(command[1]);

            if (command[0].equals("Delete")) {
                elements.removeIf(e -> e == element);

            } else if (command[0].equals("Insert") ){
                int position;
                if (command.length!=3){
                    position = Integer.parseInt(command[command.length-1]);
                } else {
                    position = Integer.parseInt(command[2]);
                }
                if (0<=position && position<elements.size()) {
                    elements.add(position, element);
                }
            }

            command = scan.nextLine().split(" ");
        }


        for (Integer element : elements) {
            System.out.print(element + " ");
        }

    }
}
