package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class BONUS_PokeMon_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  pokePower  = scan.nextInt();
        final int startPokePower = pokePower;
        int  distance = scan.nextInt();
        int  exhaustionFactor = scan.nextInt();

        int countPokes = 0;

        while (pokePower >= distance ) {

            if (((double)pokePower  == ((double)startPokePower * 0.5)) && exhaustionFactor >0){

                pokePower /= exhaustionFactor;

            }


            if (pokePower - distance  >= 0) {
                pokePower -= distance;
                countPokes++;

            } else {
                break;
            }

        }

        System.out.printf("%d%n%d",pokePower,countPokes);

    }
}
