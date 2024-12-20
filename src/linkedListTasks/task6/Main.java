package linkedListTasks.task6;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));
        numbers1.add(random.nextInt(1, 10));

        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));
        numbers2.add(random.nextInt(1, 10));

        compareTwoList(numbers1, numbers2);
    }

    public static void compareTwoList(LinkedList<Integer> num1, LinkedList<Integer> num2) {
        for (int i = 0; i < num1.size(); i++) {
            for (int j = 0; j < num2.size(); j++) {
                if (num1.get(i) == num2.get(j)) {
                    System.out.println("pair " + i + " are similar");
                }
            }
        }
    }
}
