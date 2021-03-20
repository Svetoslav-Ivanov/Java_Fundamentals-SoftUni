package Lab_ObjectsAndClases.Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_07 {

    static class Person {
        String name, id;
        int age;

        private Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public Person() {

        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    name, id, age);
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Person> persons = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputAsArray = input.split("\\s");
            Person person = new Person(inputAsArray[0],
                    inputAsArray[1], Integer.parseInt(inputAsArray[2]));

            persons.add(person);
            input = scan.nextLine();
        }


        persons= sort(persons);

        for (Person person : persons) {
            System.out.println(person.toString());
        }


    }


    static List<Person> sort(List<Person> persons) {
        List<Person> finalList = new ArrayList<>();
        finalList = new ArrayList<>();

        Person smallestPerson;

        while (!persons.isEmpty()) {
            smallestPerson = new Person();
            smallestPerson.age = Integer.MAX_VALUE;
            for (Person person : persons) {
                if (person.age<smallestPerson.age){
                    smallestPerson = person;
                }
            }
            finalList.add(smallestPerson);
            persons.remove(smallestPerson);
        }

        return finalList;
    }

}
