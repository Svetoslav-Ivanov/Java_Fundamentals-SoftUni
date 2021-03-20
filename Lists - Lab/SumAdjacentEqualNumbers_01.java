package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Double> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; ) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = 0;
                continue;
            }
            i++;
        }

        for (Double number : numbers) {
            if (number == Math.round(number)) {
                System.out.printf("%.0f ", number);
            } else {
                System.out.print(number + " ");
            }
        }

    }

    static List convertToList(String a) {

        if (a.contains(".")) {
            return makeAListOfDouble(a);
        } else {
            return makeAListOfInteger(a);
        }


    }

    static ArrayList<Double> makeAListOfDouble(String a) {
        String[] numbersAsString = a.split(" ");

        ArrayList<Double> numbers = new ArrayList<>();

        for (String s : numbersAsString) {
            numbers.add(Double.parseDouble(s));
        }

        return numbers;
    }

    static ArrayList<Integer> makeAListOfInteger(String a) {
        String[] numbersAsString = a.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (String s : numbersAsString) {
            numbers.add(Integer.parseInt((s)));
        }

        return numbers;
    }
}
