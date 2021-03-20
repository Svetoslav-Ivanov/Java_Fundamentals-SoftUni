package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int letters = scan.nextInt();

        for (char i = 97; i < 97 + letters; i++) {
            for (char j = 97; j < 97 + letters; j++) {
                for (char k = 97; k < 97 + letters; k++) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.println();
                }
            }
        }


    }
}
