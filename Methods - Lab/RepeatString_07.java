package Lab_Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = scan.nextInt();

        System.out.println(repeatString(input, n));

    }

    static String repeatString (String a, int b){
        String [] finalStrings = new String [b];


        for (int i = 0; i < b; i++) {
            finalStrings [i] = a;
        }

        String finalString = "";
        for (int i = 0; i < finalStrings.length; i++) {
             finalString +=  finalStrings[i];
        }

        return finalString;
    }

}
