package RegularExpressions_Lab;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(text);

        List<String> phones = new LinkedList<>();

        while (matcher.find()){
            phones.add(matcher.group());
        }

        System.out.println(String.join(", ", phones));
    }
}
