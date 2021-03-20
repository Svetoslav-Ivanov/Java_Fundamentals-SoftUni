package Lab_AssociativeArraysLambdaAndStreamAPI;

import java.text.DecimalFormat;
import java.util.*;


public class CountRealNumbers_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] numbers = Arrays.stream(scan.nextLine().split(" "))
        .mapToDouble(Double::parseDouble).toArray();

        TreeMap <Double, Integer> counts = new TreeMap<>();

        for (double number : numbers) {
            if (!counts.containsKey(number)){
                counts.put(number,0);
            }
            counts.put(number,counts.get(number)+1);
        }

for (Map.Entry <Double, Integer> entry : counts.entrySet()){
    DecimalFormat df = new DecimalFormat("#.#######");
    System.out.printf("%s -> %d%n",df.format(entry.getKey()), entry.getValue());
}

    }
}
