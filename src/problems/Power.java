package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - Base case: Any number raised to the power of 0 is 1.
 * - If the exponent is even: a^b = (a^(b/2)) * (a^(b/2)).
 * - If the exponent is odd: a^b = a * (a^(b-1)).
 *
 * Time Complexity: O(log b), since we reduce the exponent by half in each step.
 *
 * param a base number.
 * param b The exponent.
 * @return The value of a raised to the power of b.
 */
public class Power {
    public static long power(int a, int b) {
        if (b == 0) return 1;
        long half = power(a, b / 2);
        return (b % 2 == 0) ? half * half : half * half * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(power(a, b));
        scanner.close();
    }
}
