package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sum = 0;
        if (firstArray.length == secondArray.length) {

            for (int i = 0; i < firstArray.length ; i++) {
                sum += firstArray[i];

                if (firstArray[i] != secondArray[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                    return;
                }
            }

        } else {
            System.out.print("Arrays are not identical. Found difference at 0 index.");
        }

        System.out.printf("Arrays are identical. Sum: %d",sum);

    }
}
