package hashSetTasks.task4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> numbers = new HashSet<>();
        /* numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
         */

        freely(numbers);
    }

    public static void freely(Set<Integer> numbers) {
        if (numbers.size() == 0) {
            System.out.println("HashSet is empty");
        } else  {
            System.out.println("HashSet is not empty");
        }
    }
}
