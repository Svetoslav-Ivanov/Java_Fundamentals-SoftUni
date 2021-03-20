package Lists_Lab.Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class STAR_PokemonDoNotGo_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int value;
        int sumOfRemovedElements = 0;

        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scan.nextLine());


            if (index < 0) {
                value = pokemons.get(0);
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
            } else if (index >= pokemons.size()) {
                value = pokemons.get(pokemons.size() - 1);
                pokemons.set(pokemons.size() - 1, pokemons.get(0));
            } else {
                value = pokemons.get(index);
                pokemons.remove(index);
            }


            for (int i = 0; i < pokemons.size(); i++) {
                if (pokemons.get(i) <= value) {
                    pokemons.set(i,pokemons.get(i)+ value);
                } else {
                    pokemons.set(i,pokemons.get(i) - value);
                }
            }

            sumOfRemovedElements += value;

        }

        System.out.println(sumOfRemovedElements);
    }
}
