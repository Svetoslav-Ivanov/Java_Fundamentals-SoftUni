package RegularExpressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }

    }
}
