package Lab_ObjectsAndClases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Students2_06 {

        static class Student {
            String firstName, lastName, city;
            int age;

            public Student(String firstName, String lastName, int age, String city) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.city = city;
            }

            private int getAge() {
                return age;
            }
            private String getFirstName() {
                return firstName;
            }
            private String getLastName(){
                return lastName;
            }

        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String input = scan.nextLine();

            List<Lab_ObjectsAndClases.Students_05.Student> students = new ArrayList<>();

            while (!input.equals("end")) {

                String[] currentStudent = input.split(" ");
                Lab_ObjectsAndClases.Students_05.Student student = new Lab_ObjectsAndClases.Students_05.Student(currentStudent[0], currentStudent[1],
                        Integer.parseInt(currentStudent[2]), currentStudent[3]);

                students.add(student);
                input = scan.nextLine();
            }

            String searchingCity = scan.nextLine();

            for (Lab_ObjectsAndClases.Students_05.Student student : students) {
                if (student.city.equals(searchingCity)){
                    System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
                }
            }

        }
    }

