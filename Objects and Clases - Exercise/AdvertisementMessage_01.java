package Lab_ObjectsAndClases.Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {

    static class Combination {
        String phrase, event, author, city;

        private void setPhrase(String phrase) {
            this.phrase = phrase;
        }

        private void setEvent(String event) {
            this.event = event;
        }

        private void setAuthor(String author) {
            this.author = author;
        }

        private void setCity(String city) {
            this.city = city;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int neededMessagesCount = Integer.parseInt(scan.nextLine());
        Random randomGenerator = new Random();

        String[] phrases = new String[]{
                "Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = new String[]{
                "Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = new String[]{
                "Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{
                "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        List<Combination> combinations = new ArrayList<>();

        for (int i = 0; i < neededMessagesCount; i++) {
            Combination combination = new Combination();
            combination.setAuthor(authors[randomGenerator.nextInt(events.length)]);
            combination.setPhrase(phrases[randomGenerator.nextInt(phrases.length)]);
            combination.setEvent(events[randomGenerator.nextInt(events.length)]);
            combination.setCity(cities[randomGenerator.nextInt(cities.length)]);

            combinations.add(combination);
        }

        for (Combination combination : combinations) {
            printFormat(combination);
        }


    }


    static void printFormat(Combination combination) {
        System.out.printf("%s %s %s – %s%n",
                combination.phrase, combination.event,
                combination.author, combination.city);
    }

}
