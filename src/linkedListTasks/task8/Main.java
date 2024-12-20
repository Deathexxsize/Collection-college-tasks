package linkedListTasks.task8;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random  = new Random();

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));

        replaceMethod(numbers1);
    }

    public static void replaceMethod(LinkedList<Integer> numbers) {
        System.out.println(numbers.set(2, 8));
    }
}
