package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class _90_BONUS_Snowballs_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countSnowballs = scan.nextInt();

        int snowballValue = Integer.MIN_VALUE;
        int recordSnow = 0;
        int recordTime = 0;
        int recordQuality = 0;


        for (int i = 0; i < countSnowballs; i++) {

            int snowballSnow = scan.nextInt();
            int snowballTime = scan.nextInt();
            int snowballQuality = scan.nextInt();

            int currentSnowballValue = (int) Math.pow(((double) snowballSnow / snowballTime), snowballQuality);

            if (currentSnowballValue > snowballValue) {
                snowballValue = currentSnowballValue;
                recordSnow = snowballSnow;
                recordTime = snowballTime;
                recordQuality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %d (%d)", recordSnow, recordTime, snowballValue, recordQuality);

    }
}
