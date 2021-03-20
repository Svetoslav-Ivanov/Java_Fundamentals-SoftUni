package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentAcademy_07 {
/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<Double>> studentsResults = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scan.next();
            Double grade = scan.nextDouble();

            studentsResults.putIfAbsent(name, new ArrayList<>());
            studentsResults.get(name).add(grade);
            studentsResults.putIfAbsent(name, studentsResults.get(name));
        }
        studentsResults.entrySet()
                .stream()
                .filter(a ->
                        studentsResults.entrySet()
                                .stream()
                                .sorted((list1,list2) -> Double.compare(studentsResults.get(list2).get(0) , studentsResults.get(list1).get(0
                                        .average().orElse(0.00)))
                )
                .sorted((a, b) ->
                        Double.compare(studentsResults.get(b).get(0), studentsResults.get(a).get(0))
                )
                .forEach((result)->
                        System.out.printf("%s -> %.2f", result.getKey(), (result.getValue().get(0)))
                );

    }

 */
}
