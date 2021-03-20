package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class PadawanEquipment_10_EXAM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightSaberPrice = Double.parseDouble(scan.nextLine()) * Math.ceil(studentsCount * 1.10);
        double robePrice = studentsCount * Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        double totalPrice = lightSaberPrice + robePrice;

        int beltCount = studentsCount - (studentsCount/6);

        totalPrice += beltPrice * beltCount;

         if (amountOfMoney >= totalPrice){
             System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
         } else {
             System.out.printf("Ivan Cho will need %.2flv more.",Math.abs(amountOfMoney - totalPrice));
         }

    }
}
