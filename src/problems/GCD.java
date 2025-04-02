package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - Uses the Euclidean Algorithm: GCD(a, b) = GCD(b, a % b).
 * - Base case: If b == 0, return a.
 *
 * Time Complexity: O(log min(a, b)), as each step reduces the problem size.
 *
 * param a first number.
 * param b The second number.
 * @return The GCD of a and b.
 */
public class GCD {
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
        scanner.close();
    }
}
