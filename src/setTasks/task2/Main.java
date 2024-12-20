package setTasks.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Student> studentsSet = new HashSet<>();


        studentsSet.add(new Student("Alisa", 18));
        studentsSet.add(new Student("Bek", 22));
        studentsSet.add(new Student("Nur", 19));
        studentsSet.add(new Student("Asan", 18));
        studentsSet.add(new Student("Ali", 20));

        for (Student student : studentsSet) {
            System.out.println(studentsSet);
        }

    }


}
