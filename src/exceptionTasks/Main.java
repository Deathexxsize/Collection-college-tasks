package exceptionTasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        try {
            System.out.println(isPerfectSquare(num));
        } catch (MyException error) {
            System.err.println(error.getMessage());
        }

    }
    public static boolean isPerfectSquare(int number) throws MyException {
        if (number < 0) {
            throw new MyException("Отрицательные числа не могут быть квадратами.");
        }
        int sqrt = (int) Math.sqrt(number);
        if (sqrt * sqrt != number) {
            throw new MyException("Число " + number + " не является квадратом какого-либо целого числа.");
        }
        return true;
    }
}
