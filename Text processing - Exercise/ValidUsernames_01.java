package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> usernames = Arrays.stream(scan.nextLine()
                .split(",\\s")).collect(Collectors.toList());

        for (String username : usernames) {
            boolean isInvalid = false;

            if (3 < username.length() && username.length() < 16) {
                for (int i = 0; i < username.length(); i++) {
                    if ((!Character.isLetterOrDigit(username.charAt(i)) &&
                            username.charAt(i) != '-' && username.charAt(i) != '_')) {
                        isInvalid = true;
                    }
                }

                if (isInvalid) {
                    continue;
                }

            } else {
                continue;
            }
            System.out.println(username);
        }


    }
}
