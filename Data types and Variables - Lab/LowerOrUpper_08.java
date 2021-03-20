package Lab_DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String character = scan.nextLine();
        char charAt = character.charAt(0);

        for (char i = 'a' ; i <= 'z' ; i++) {

            if (charAt == i){
                System.out.println("lower-case");
                return;
            }

        }
        System.out.println("upper-case");

    }
}
