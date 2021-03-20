package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArray = new int[firstArray.length-1];

        for (int i = 0; i <secondArray.length; i++) {
            for (int j = 0; j < firstArray.length-1; j++) {
                secondArray[j] = firstArray[j] + firstArray[j + 1];

            }
            firstArray = secondArray;
        }

        System.out.println(firstArray[0]);
    }
}
/*            1 2 3                  1 2 3 4 5 6
              1+2 2+3            1+2 2+3 3+4 4+5 5+6
              3  +  5
                 8                 3+5 5+7 7+9 9+11

                                    8 + 12 12+16 16+20
                                    20 + 28  28 + 36
                                        48 + 63
 */