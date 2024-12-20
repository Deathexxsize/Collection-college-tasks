package hashSetTasks.task7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));

        compareTwoList(numbers1, numbers2);
    }

    public static void compareTwoList(Set<Integer> num1, Set<Integer> num2) {


    }
}
