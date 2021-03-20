package Lab_Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        printCorrespondingGradeInWords(grade);
    }


    // TODO Print corresponding grade in words
    static void printCorrespondingGradeInWords (double a){
        if (a >= 2 && 3>a){
            System.out.println("Fail");
        } else if (a<3.5) {
            System.out.println("Poor");
        } else if (a<4.5){
            System.out.println("Good");
        } else if (a<5.5){
            System.out.println("Very good");
        } else if (a<=6) {
            System.out.println("Excellent");
        }
    }

}
