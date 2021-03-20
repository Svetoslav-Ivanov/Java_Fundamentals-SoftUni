package Lab_Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        int helpingVariable = array.length - 1;
        for (int i = 0; i < array.length / 2 ; i++) {
            String currentElement = array[i];

            array[i] = array[helpingVariable];
            array[helpingVariable] = currentElement;
            helpingVariable --;
        }

        for (String currentElement : array) {

            System.out.print(currentElement + " ");

        }

    }
}
