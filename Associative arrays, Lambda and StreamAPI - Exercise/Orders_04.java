package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class Orders_04 {

    static class Product {
        String name;
        double price, quantity;

        private Product(String name, double price, double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        private Product(double quantity){
            this.quantity = quantity;
        }

        private double getTotalPrice() {
            return quantity * price;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Map<String, Product> productsData = new LinkedHashMap<>();

        while (!input[0].equals("buy")) {
            String currentProductName = input[0];
            double currentProductPrice = Double.parseDouble(input[1]);
            double currentProductQuantity = Double.parseDouble(input[2]);


            productsData.putIfAbsent(currentProductName,new Product(0));

            Product currentProduct = new Product(currentProductName,
                    currentProductPrice,
                    productsData.get(currentProductName).quantity
                            + currentProductQuantity);

            productsData.put(currentProductName,currentProduct);

            input = scan.nextLine().split("\\s+");
        }

        productsData.forEach((a,b) -> System.out.printf("%s -> %.2f%n",
                a, b.getTotalPrice()));

    }
}
