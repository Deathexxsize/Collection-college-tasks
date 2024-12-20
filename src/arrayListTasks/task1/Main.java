package arrayListTasks.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Bobr", 18, "Java"));
        listStudents.add(new Student("Vlad", 19, "JS"));
        listStudents.add(new Student("Suli", 21, "Java"));
        listStudents.add(new Student("Kurmash", 18, "Java"));
        listStudents.add(new Student("Shah", 20, "JS"));
        listStudents.add(new Student("Bek", 18, "JS"));
        listStudents.add(new Student("Azal", 21, "Java"));
        listStudents.add(new Student("Nur", 19, "JS"));
        listStudents.add(new Student("Aziz", 20, "Java"));
        listStudents.add(new Student("Uluk", 23, "JS"));

        System.out.println("\nAll students: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }


        //sorting by group
        ArrayList<Student> javaStudents = new ArrayList<>();
        ArrayList<Student> jsStudents = new ArrayList<>();

        for (Student student : listStudents) {
            if ("Java".equals(student.getGroup())) {
                javaStudents.add(student);
            } else if ("JS".equals(student.getGroup())) {
                jsStudents.add(student);
            }
        }

        System.out.println("\nJava students: ");
        for (Student student : javaStudents) {
            System.out.println(student);
        }

        System.out.println("\nJS students: ");
        for (Student student : jsStudents) {
            System.out.println(student);
        }


        //sorting by age
        ArrayList<Student> StudentsAged19_23 = new ArrayList<>();

        for (Student student : listStudents) {
            if (student.getAge() >= 19 && student.getAge() <= 23) {
                StudentsAged19_23.add(student);
            }
        }

        System.out.println("\nStudents aged 19-23: ");
        for (Student student : StudentsAged19_23) {
            System.out.println(student);
        }


        //sorting by the first letter of the name
        ArrayList<Student> firstLetterOfName = new ArrayList<>();

        for (Student student : listStudents) {
            if (student.getName().startsWith("A")) {
                firstLetterOfName.add(student);
            }
        }

        System.out.println("\nStudents with the letter A: ");
        for (Student student : firstLetterOfName) {
            System.out.println(student);
        }
    }
}
