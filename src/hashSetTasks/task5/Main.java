package hashSetTasks.task5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> numbers = new HashSet<>();
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));
        numbers.add(random.nextInt(1, 10));

        HashInTree(numbers);
    }

    public static void HashInTree(Set<Integer> numbers) {
        TreeSet<Integer> treeNum = new TreeSet<>();

        treeNum.addAll(numbers);

        System.out.println(treeNum);
    }
}
