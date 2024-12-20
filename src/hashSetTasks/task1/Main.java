package hashSetTasks.task1;

import java.util.HashSet;
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

        getAllElements(numbers);
    }

    public static void getAllElements(Set<Integer> numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
