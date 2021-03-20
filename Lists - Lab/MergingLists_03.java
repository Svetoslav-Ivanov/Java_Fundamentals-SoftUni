package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();

        while ((!firstList.isEmpty()) || (!secondList.isEmpty())) {

            if (!firstList.isEmpty()) {
                finalList.add(firstList.get(0));
                firstList.remove(0);
            }

            if (!secondList.isEmpty()) {
                finalList.add(secondList.get(0));
                secondList.remove(0);
            }

        }

        for (Integer number : finalList) {
            System.out.print(number + " ");
        }


    }
}
