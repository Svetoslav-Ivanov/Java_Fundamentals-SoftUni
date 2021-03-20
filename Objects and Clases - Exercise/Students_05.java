package Lab_ObjectsAndClases.Exercise_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    static class Student {
        String firstName, lastName;
        double grade;

        private Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        private Student() {

        }

        public String toString() {
            return String.format("%s %s: %.2f", firstName, lastName, grade);
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentAsArray = scan.nextLine().split("\\s+");

            Student student = new Student(studentAsArray[0], studentAsArray[1],
                    Double.parseDouble(studentAsArray[2]));

            students.add(student);
        }

        students = sort(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }

    static List<Student> sort(List<Student> students) {
        List<Student> finalList = new ArrayList<>();
        finalList = new ArrayList<>();

        Student bestStudent;

        while (!students.isEmpty()) {
            bestStudent = new Student();
            bestStudent.grade = Double.MIN_VALUE;
            for (Student student : students) {
                if (student.grade>bestStudent.grade){
                    bestStudent = student;
                }
            }
            finalList.add(bestStudent);
            students.remove(bestStudent);
        }

       return finalList;
    }
}
