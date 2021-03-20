package Lab_Arrays.Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < array.length - 1; i++) {
            boolean isBigger = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger) {
                System.out.print(array[i] + " ");
            }

        }

        System.out.print(array[array.length-1]);

    }
}

//
//The anti-forgery token could not be decrypted. If this application is hosted by a Web Farm or cluster, ensure that all machines are running the same version of ASP.NET Web Pages and that the <machineKey> configuration specifies explicit encryption and validation keys.
  //      AutoGenerate cannot be used in a cluster.
