package Lab_Arrays.Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int magicSum = scan.nextInt();
        int magicNumSum;


        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                magicNumSum = input[i] + input[j];

                if (magicNumSum == magicSum) {

                    System.out.printf("%n%d %d", input[i], input[j]);

                }
            }
        }


    }
}
