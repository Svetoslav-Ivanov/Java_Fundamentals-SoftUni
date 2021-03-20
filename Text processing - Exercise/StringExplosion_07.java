package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int strength = 0;

        StringBuilder line = new StringBuilder();
        line.append(scan.nextLine());

        for (int i = 0; i < line.length(); i += 0) {

            if (line.charAt(i) == '>') {
                strength += Integer.parseInt("" + line.charAt(i + 1));
                i++;
            } else {
                if (strength > 0 ) {
                    line.replace(i, i + 1, "");
                    strength--;
                } else {
                    i++;
                }
            }
        }

        System.out.println(line.toString());

    }
}
