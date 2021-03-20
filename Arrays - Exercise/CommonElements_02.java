package Lab_Arrays.Exercise_Arrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArr = scan.nextLine().split(" ");
        String[] secondArr = scan.nextLine().split(" ");


        for (String sElement : secondArr) {
            for (String fElement : firstArr) {
                if (fElement.equals(sElement)) {
                    System.out.print(sElement + " ");
                }
            }

        }


    }
}
