package Lab_ObjectsAndClases.Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {

    static class Person {
        String name;
        int age;

        private void setName(String name) {
            this.name = name;
        }

        private void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return String.format("%s - %d", name,age);
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personAsArray = scan.nextLine().split("\\s");

            Person person = new Person();

            person.setName(personAsArray[0]);
            person.setAge(Integer.parseInt(personAsArray[1]));
            persons.add(person);
        }

        persons = stream(persons, 30);
        persons.sort((a, b) -> a.name.compareTo(b.name));

        for (Person person : persons) {
            System.out.println(person.toString());
        }


    }

    static List<Person> stream(List<Person> persons, int ageLimit) {
        List<Person> finalList = new ArrayList<>();

        for (Person person : persons) {
            if (person.age > ageLimit) {
                finalList.add(person);
            }
        }
        return finalList;
    }
}
