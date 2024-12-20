package setTasks.task1;

import arrayListTasks.task1.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 400; i++) {
            numbers.add(i);
        }

        for (Number number : numbers) {
            System.out.println(number);
        }

        Set<Integer> hashSet = new HashSet<>();

        hashSet.addAll(numbers);

        int sum = 0;
        for (Integer number : hashSet) {
            sum += number;
        }

        System.out.println("\nSum of values in HashSet: " + sum);
    }
}
