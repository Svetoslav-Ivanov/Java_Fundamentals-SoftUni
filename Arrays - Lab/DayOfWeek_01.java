package Lab_Arrays;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDay = scan.nextInt();

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (1<=numberOfDay && numberOfDay<= 7){

            System.out.println(days[numberOfDay - 1]);

        } else {

            System.out.println("Invalid day!");

        }


    }
}
