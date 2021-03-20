package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayerCarts = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCarts = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while ((!firstPlayerCarts.isEmpty()) && (!secondPlayerCarts.isEmpty())) {
            int firstIndex = 0;
            int secondIndex = 0;

            while (firstIndex < firstPlayerCarts.size() && secondPlayerCarts.size() > secondIndex) {

                if (firstPlayerCarts.get(firstIndex) > secondPlayerCarts.get(secondIndex)) {
                    firstPlayerCarts.add(firstPlayerCarts.get(firstIndex));
                    firstPlayerCarts.remove(firstIndex);
                    firstPlayerCarts.add( secondPlayerCarts.get(secondIndex));
                    secondPlayerCarts.remove(secondIndex);

                } else if (secondPlayerCarts.get(secondIndex) > firstPlayerCarts.get(firstIndex)) {
                    secondPlayerCarts.add(secondPlayerCarts.get(secondIndex));
                    secondPlayerCarts.remove(secondIndex);
                    secondPlayerCarts.add( firstPlayerCarts.get(firstIndex));
                    firstPlayerCarts.remove(firstIndex);

                } else {
                    firstPlayerCarts.remove(firstIndex);
                    secondPlayerCarts.remove(secondIndex);
                }

            }

        }


        int sum = 0;
        if (firstPlayerCarts.isEmpty()) {
            for (Integer secondPlayerCart : secondPlayerCarts) {
                sum += secondPlayerCart;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else  {
            for (Integer firstPlayerCart : firstPlayerCarts) {
                sum += firstPlayerCart;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }


    }
}
