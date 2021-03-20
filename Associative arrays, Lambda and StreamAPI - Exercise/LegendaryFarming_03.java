package Lab_AssociativeArraysLambdaAndStreamAPI.Exercise_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> materials = new HashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new TreeMap<>();


        boolean gotALegendaryItem = false;
        while (!gotALegendaryItem) {

            int quantity = scan.nextInt();
            String material = scan.next().toLowerCase(Locale.ROOT);

            switch (material) {

                case "shards":
                    materials.put(material, materials.get(material) + quantity);

                    if (materials.get(material) >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        materials.put(material, materials.get(material) - 250);
                        gotALegendaryItem = true;
                    }
                    break;

                case "fragments":
                    materials.put(material, materials.get(material) + quantity);

                    if (materials.get(material) >= 250) {
                        System.out.println("Valanyr obtained!");
                        materials.put(material, materials.get(material) - 250);
                        gotALegendaryItem = true;
                    }
                    break;

                case "motes":
                    materials.put(material, materials.get(material) + quantity);

                    if (materials.get(material) >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        materials.put(material, materials.get(material) - 250);
                        gotALegendaryItem = true;
                    }
                    break;

                default:
                    junks.putIfAbsent(material, 0);
                    junks.put(material, junks.get(material) + quantity);
                    break;

            }

        }

        materials.entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    } else {
                        result = b.getValue().compareTo(a.getValue());
                    }
                    return result;
                })
                .forEach(a -> System.out.printf("%s: %d%n", a.getKey(), a.getValue()));

        junks.forEach((a, b) -> System.out.printf("%s: %d%n", a, b));
    }
}
