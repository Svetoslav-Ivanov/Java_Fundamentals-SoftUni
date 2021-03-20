package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courseData = new TreeMap<>();


        String[] input = scan.nextLine().split("\\s+:\\s+");
        while (!input[0].equals("end")) {

            courseData.putIfAbsent(input[0], new ArrayList<>());
            if (!courseData.get(input[0]).contains(input[1])){
                courseData.get(input[0]).add(input[1]);
            }

            input = scan.nextLine().split(" : ");
        }

        courseData.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(a -> {
                    System.out.printf("%s: %d%n", a.getKey(), a.getValue().size());
                   a.getValue()
                           .stream()
                           .sorted()
                           .forEach(n ->
                                   System.out.println("-- " + n));
                });

    }
}
