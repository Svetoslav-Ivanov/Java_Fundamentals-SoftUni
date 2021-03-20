package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class CompanyUsers_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, List<String>> companies = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] companyData = input.split(" -> ");

            companies.putIfAbsent(companyData[0], new ArrayList<>());

            if (!companies.get(companyData[0]).contains(companyData[1])) {
                companies.get(companyData[0]).add(companyData[1]);
            }

            input = scan.nextLine();
        }

        companies.entrySet()
                .stream()
                .sorted()
                .forEach(K -> {
                    System.out.println(K.getKey());
                    K.getValue()
                            .stream()
                            .sorted()
                            .forEach(n ->
                                    System.out.printf("-- %s%n" + n));
                });


    }
}
