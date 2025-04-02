package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - Uses a recursive approach.
 * - Base case: factorial(0) and factorial(1) return 1.
 * - Recursive case: factorial(n) = n * factorial(n - 1).
 *
 * Time Complexity: O(n), where n is the input number.
 *
 * param n The number for which the factorial is calculated.
 * @return The factorial of the given number.
 */
public class Factorial {
    public static long factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}
