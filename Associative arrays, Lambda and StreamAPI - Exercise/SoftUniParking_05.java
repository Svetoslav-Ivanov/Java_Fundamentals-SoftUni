package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<String, String> users = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandAsArray = scan.nextLine().split("\\s+");
            String command = commandAsArray[0];
            String username = commandAsArray[1];
            String plateNumber;

            switch (command) {
                case "register":

                    plateNumber = commandAsArray[2];
                    if (!users.containsKey(username)) {
                        System.out.printf("%s registered %s successfully%n",
                                username, plateNumber);
                        users.putIfAbsent(username, plateNumber);

                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                plateNumber);
                    }
                    break;

                default:
                    if (!users.containsKey(username)) {
                        System.out.printf(
                                "ERROR: user %s not found%n", username);

                    } else {
                        System.out.printf("%s unregistered successfully%n", username);
                        users.remove(username);
                    }

                    break;
            }
        }

        users.forEach((K, V) -> System.out.printf("%s => %s%n", K, V));
    }
}
