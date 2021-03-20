package Lab_Arrays.Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        if (array.length == 1) {
            System.out.println("0");
            return;
        }


        for (int i = 0; i < array.length ; i++) {

            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                rightSum += array[j];
            }

            int leftSum = 0;
            for (int j =1 + i ; j < array.length ; j++) {
                leftSum += array[j];
            }


            if (leftSum == rightSum) {
                System.out.println(i);
                return;

            }

        }

        System.out.println("no");

    }
}