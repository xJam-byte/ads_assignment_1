package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - Base case: If n is 0, return an empty string.
 * - Recursive case: Convert n/2 to binary and append (n % 2).
 *
 * Time Complexity: O(log n), since we divide the number by 2 in each step.
 *
 * param n The decimal number.
 * @return The binary representation as a string.
 */
public class ToBinary {
    public static String toBinary(int n) {
        if (n == 0) return "";
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n == 0) ? "0" : toBinary(n)); // Handle 0 separately
        scanner.close();
    }
}
