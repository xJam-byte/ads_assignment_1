package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - Base case: If the number is 0, return 0 (edge case).
 * - Recursive case: Remove the last digit (n / 10) and add 1 to the count.
 *
 * Time Complexity: O(log n), since we remove one digit at a time.
 *
 * param n The input integer.
 * @return The number of digits in the integer.
 */
public class CountDigits {
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDigits(Math.abs(n))); // Handling negative numbers
        scanner.close();
    }
}
