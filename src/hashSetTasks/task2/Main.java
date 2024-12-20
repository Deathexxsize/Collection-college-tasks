package hashSetTasks.task2;

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

        getElement(numbers);
    }

    public static void getElement(Set<Integer> numbers) {
        int temp = 0;

        for (Integer num : numbers) {
            temp = temp + num;
        }

        System.out.println(temp);
    }
}
