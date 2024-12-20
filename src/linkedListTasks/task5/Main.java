package linkedListTasks.task5;

import java.util.Arrays;
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

        LinkedListInList(numbers);
    }

    public static void LinkedListInList(LinkedList<Integer> numbers) {
        int[] array = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {
            array[i] = numbers.get(i);
        }
        System.out.println(Arrays.toString(array));
    }
}
