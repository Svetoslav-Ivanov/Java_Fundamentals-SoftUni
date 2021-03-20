package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        List<String> inputAsList = new ArrayList<>();

        while (!input.equals("stop")) {
            inputAsList.add(input);
            input = scan.next();
        }

        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        for (int i = 0; i < inputAsList.size() - 1; i += 2) {
            if (!resourceQuantity.containsKey(inputAsList.get(i))) {
                resourceQuantity.put(inputAsList.get(i), Integer.parseInt(inputAsList.get(i + 1)));
                continue;
            }
            resourceQuantity.put(inputAsList.get(i),
                    resourceQuantity.get(inputAsList.get(i)) + Integer.parseInt(inputAsList.get(i + 1)));
        }

        for (Map.Entry<String, Integer> entry : resourceQuantity.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
