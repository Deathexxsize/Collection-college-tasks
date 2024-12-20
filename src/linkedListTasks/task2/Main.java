package linkedListTasks.task2;

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

        firstValue(numbers);

    }

    public static void firstValue(LinkedList<Integer> numbers) {
        System.out.println(numbers.getFirst());
    }
}
