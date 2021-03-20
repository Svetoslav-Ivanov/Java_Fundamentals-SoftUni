package Lists_Lab.Lists_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scan.nextLine().split("\\|"))
                .collect(Collectors.toList());


        Collections.reverse(arrays);

        for (int i = 0; i < arrays.size(); i++) {
            String[] currentArrayAsArray = arrays.get(i).split("\\s+");
            String currentArrayAsString = "";

            for (String s : currentArrayAsArray) {
                if (!s.equals("")) {
                    currentArrayAsString += s + " ";
                }
            }
            arrays.set(i, currentArrayAsString);
        }


        for (
                String array : arrays) {
            System.out.print(array);
        }


    }
}
