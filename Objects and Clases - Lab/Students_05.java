package Lab_ObjectsAndClases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    static class Student {
        String firstName, lastName, city;
        int age;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        int getAge() {
            return age;
        }

        String getFirstName() {
            return firstName;
        }

        String getLastName() {
            return lastName;
        }


        void setAge(int age) {
            this.age = age;
        }

        void setCity(String city) {
            this.city = city;
        }


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Student> students = new ArrayList<>();


        while (!input.equals("end")) {
            boolean didOverload = false;


            String[] currentStudent = input.split(" ");
            Student student = new Student(currentStudent[0], currentStudent[1],
                    Integer.parseInt(currentStudent[2]), currentStudent[3]);

            for (Student curStudent : students) {
                if (isExisting(students, currentStudent[0], currentStudent[1])) {
                    curStudent.setAge(Integer.parseInt(currentStudent[2]));
                    curStudent.setCity(currentStudent[3]);
                    didOverload = true;
                }
            }

            if (!didOverload) {
                students.add(student);
            }

            input = scan.nextLine();
        }

        String searchingCity = scan.nextLine();

        for (Student student : students) {
            if (student.city.equals(searchingCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    private static boolean isExisting(List<Student> students, String firstName, String lastName) {
        for (Student currentStudent : students) {
            if (currentStudent.getFirstName().equals(firstName)
                    && currentStudent.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

}
