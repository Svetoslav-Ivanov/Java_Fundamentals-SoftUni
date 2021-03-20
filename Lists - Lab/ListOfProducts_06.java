package Lists_Lab;

import java.util.*;


public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(scan.nextLine());
        }

        Collections.sort(products);

        int index = 1;
        for (String product : products) {
            System.out.printf("%d.%s%n", index, product);
            index++;
        }

    }
}
