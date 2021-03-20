package Lab_Arrays.Exercise_Arrays;

import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        int[] maxSequenceOfEqualElements = new int[2];
        int biggestEqualElementCount = Integer.MIN_VALUE;
        int currentEqualElementCount = 1;


        boolean havesJustOneSymbol = true;
        for (String symbol : array) {
            for (String secSymbol : array) {
                if (!symbol.equals(secSymbol)) {
                    havesJustOneSymbol = false;
                    break;
                }
            }
        }


        if (havesJustOneSymbol) {
            for (String symbol : array) {

                System.out.print(symbol + " ");
            }
            return;
        }


        for (int i = 0; i < array.length; i++) {

            if (i + 1 < array.length - 1) {

                if (array[i].equals(array[i + 1])) {
                    currentEqualElementCount++;
                    continue;
                }

            }

            if (currentEqualElementCount > biggestEqualElementCount) {
                biggestEqualElementCount = currentEqualElementCount;
                maxSequenceOfEqualElements[0] = biggestEqualElementCount;
                maxSequenceOfEqualElements[1] = Integer.parseInt(array[i]);
            }

            if (i > 0) {
                if (!array[i].equals(array[i - 1])) {
                    currentEqualElementCount = 0;
                }
            }
        }



        for (int i = 0; i < maxSequenceOfEqualElements[0]; i++) {
            System.out.print(maxSequenceOfEqualElements[1] + " ");
        }


    }
}
