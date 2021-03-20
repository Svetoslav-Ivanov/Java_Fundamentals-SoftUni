package Lab_Arrays.Exercise_Arrays;

import java.util.Scanner;

public class _Fucking_ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String[] arr = scan.nextLine().split(" ");


        int indexFirstPosition = scan.nextInt();



        while (indexFirstPosition > arr.length - 1) {

            indexFirstPosition -= arr.length;

        }


        if (indexFirstPosition == 0) {

            for (String currentNum : arr) {
                System.out.print(currentNum + " ");
            }

            return;

        }


        String[] finalArr = new String[arr.length];


        int lastIndex = 1;
        for (int currentIndex = 0; currentIndex < arr.length - 1; currentIndex++, indexFirstPosition++) {

            lastIndex = currentIndex+1;
            if (indexFirstPosition > arr.length -1 ) {
                lastIndex--;
                break;

            } else {
                finalArr[currentIndex] = arr[indexFirstPosition];
            }


        }



        for (int i = 0; lastIndex < finalArr.length ; i++, lastIndex++) {
            finalArr[lastIndex] = arr[i];
        }


        for (String curElement : finalArr) {
            System.out.print(curElement + " ");
        }

    }
}
