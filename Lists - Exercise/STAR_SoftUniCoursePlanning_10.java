package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class STAR_SoftUniCoursePlanning_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scan.nextLine().split(",\\s"))
                .collect(Collectors.toList());

        String commandForEnd = scan.nextLine();

        schedule.removeIf(e -> e.equals(""));

        while (!commandForEnd.equalsIgnoreCase("course start")) {
            String[] command = commandForEnd.split(":");

            switch (command[0]) {
                case "Add":
                    if (!schedule.contains(command[1])) {
                        schedule.add(command[1]);
                    }
                    break;

                case "Insert":
                    if (!schedule.contains(command[1])) {
                        int index = Integer.parseInt(command[2]);
                        schedule.add(index, command[1]);
                    }
                    break;

                case "Remove":
                    schedule.remove(command[1]);
                    schedule.remove(command[1] + "-Exercise");
                    break;

                case "Swap":
                    if (schedule.contains(command[1]) && schedule.contains(command[2])) {
                        String secondLessonName = command[2];

                        schedule.set(schedule.indexOf(command[2]), command[1]);
                        schedule.set(schedule.indexOf(command[1]), secondLessonName);

                        if (schedule.contains(command[1] + "-Exercise") && schedule.contains(command[2] + "-Exercise")) {

                            schedule.remove(command[1] + "-Exercise");
                            schedule.remove(command[2] + "-Exercise");

                            schedule.add(schedule.indexOf(command[1]) + 1, command[1] + "-Exercise");
                            schedule.add(schedule.indexOf(command[2]) + 1, command[2] + "-Exercise");

                        } else if (!schedule.contains(command[1] + "-Exercise") && schedule.contains(command[2] + "-Exercise")) {

                            schedule.remove(command[2] + "-Exercise");

                            schedule.add(schedule.indexOf(command[2]) + 1, command[2] + "-Exercise");

                        } else if (schedule.contains(command[1] + "-Exercise") && !schedule.contains(command[2] + "-Exercise")) {

                            schedule.remove(command[1] + "-Exercise");

                            schedule.add(schedule.indexOf(command[1]) + 1, command[1] + "-Exercise");

                        }

                    }
                    break;

                case "Exercise":
                    if (!schedule.contains(command[1])) {
                        schedule.add(command[1]);
                    }
                    if (!schedule.contains(command[1] + "-Exercise")) {
                        schedule.add(schedule.indexOf(command[1]) + 1, command[1] + "-Exercise");
                    }
                    break;

            }

            commandForEnd = scan.nextLine();
        }

        int index = 0;
        for (String lesson : schedule) {
            index++;
            System.out.printf("%d.%s%n", index, lesson.trim());

        }


    }
}
