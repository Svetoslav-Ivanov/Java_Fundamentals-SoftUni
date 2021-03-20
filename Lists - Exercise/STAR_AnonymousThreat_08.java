package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class STAR_AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> strings = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("3:1")) {

            switch (command[0]) {

                case "merge":
                    int startIndex = Integer.parseInt(command[1]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    int endIndex = Integer.parseInt(command[2]);
                    if (endIndex >= strings.size()) {
                        endIndex = strings.size() - 1;
                    }
                    for (int i = startIndex; i < endIndex; i++) {
                        strings.set(startIndex, strings.get(startIndex) + strings.get(startIndex + 1));
                        strings.remove(startIndex + 1);
                    }
                    break;

                case "divide":
                    int index = Integer.parseInt(command[1]);
                    final int partitions = Integer.parseInt(command[2]);
                    int charactersToAdd = (strings.get(index).length()) / partitions;

                    int iterations = partitions;
                    if (strings.get(index).length() % partitions != 0) {
                        iterations--;
                    }

                    // Върти броя на стринговете
                    for (int i = 0, indexAddAtList = index + 1, currentCharToAdd = 0, lastCharToAdd = charactersToAdd;
                         i < iterations;
                         i++, indexAddAtList++, lastCharToAdd += charactersToAdd) {

                        String currentString = "";

                        // Създава стринговете
                        while (currentCharToAdd < lastCharToAdd) {
                            currentString += strings.get(index).charAt(currentCharToAdd);
                            currentCharToAdd++;
                        }

                        strings.add(indexAddAtList, currentString);
                    }

                    // Определя дали има нужда от последен стринг
                    if (strings.get(index).length() % partitions != 0) {

                        String currentString = "";
                        int currentCharToAdd = strings.get(index).length() - charactersToAdd * iterations;
                        charactersToAdd += strings.get(index).length() % partitions;

                        // Създава последния стринг
                        for (int i = 0; i < charactersToAdd; i++, currentCharToAdd++) {
                            currentString += strings.get(index).charAt(currentCharToAdd);
                        }
                        strings.add(index + partitions, currentString);

                    }

                    strings.remove(index);
                    break;

            }

            command = scan.nextLine().split(" ");
        }

        for (String string : strings) {
            System.out.print(string + " ");
        }


    }
}
