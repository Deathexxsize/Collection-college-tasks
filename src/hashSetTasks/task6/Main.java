package hashSetTasks.task6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> numbers = new HashSet<>();
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));

        LinkedInHash(numbers);
    }

    public static void LinkedInHash(Set<Integer> numbers) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addAll(numbers);

        System.out.println(linkedList);
    }
}
