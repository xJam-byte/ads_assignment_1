package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - Base cases: Fibonacci(0) = 0, Fibonacci(1) = 1.
 * - Recursive case: Fibonacci(n) = Fibonacci(n - 1) + Fibonacci(n - 2).
 *
 * Time Complexity: O(2^n) (exponential growth).
 *
 * param n The index of the Fibonacci sequence.
 * @return The nth Fibonacci number.
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
        scanner.close();
    }
}
