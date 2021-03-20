package Lab_DataTypesAndVariables.Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int p = scan.nextInt();


        int courses = n / p;

        if (n % p != 0) {
            courses++;
        }

        System.out.println(courses);


    }
}
