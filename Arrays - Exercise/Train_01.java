package Lab_Arrays.Exercise_Arrays;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();

        int[] wagons = new int[n];
        int sum = 0;

        for (int i = 0; i < wagons.length ; i++) {
            int countPeople = scan.nextInt();
            sum += countPeople;
            wagons[i] = countPeople;
            System.out.print(wagons [i] + " ");
        }

        System.out.printf("%n%d",sum);

    }
}
