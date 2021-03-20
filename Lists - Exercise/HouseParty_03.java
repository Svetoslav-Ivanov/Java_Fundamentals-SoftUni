package Lists_Lab.Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCommand = Integer.parseInt(scan.nextLine());
        List<String> persons = new ArrayList<>();

        for (int i = 0; i < countCommand; i++) {

            String [] command = scan.nextLine().split( " ");
            if ((!persons.contains(command[0])) && command[2].equals("going!")){
                persons.add(command[0]);
            } else if (command[2].equals("going!")){
                System.out.printf("%s is already in the list!%n", command[0]);
            } else if (persons.contains(command[0]) && command[2].equals("not")){
                persons.remove(command[0]);
            } else if (command[2].equals("not")){
                System.out.printf("%s is not in the list!%n", command[0]);
            }

        }

        for (String person : persons) {
            System.out.println(person);
        }


    }
}
