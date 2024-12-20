package linkedListTasks.task4;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));

        searchValue(numbers, 11);
    }

    public static void searchValue(LinkedList<Integer> numbers, int num) {
        System.out.println(numbers.contains(num));
    }
}
