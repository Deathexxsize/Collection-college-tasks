package linkedListTasks.task1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 25));
        }

        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> notEven = new LinkedList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            } else {
                notEven.add(numbers.get(i));
            }
        }

        Collections.sort(even);
        Collections.sort(notEven);

        System.out.println("\nAll numbers: " + numbers);
        System.out.println("Even: " + even);
        System.out.println("Not even: " + notEven);
    }


}
