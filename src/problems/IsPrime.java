package problems;

import java.util.Scanner;

/**
 * This method checks if a number is prime using recursion.
 *
 * Approach:
 * - A number is prime if it is greater than 1 and not divisible by any number
 *   other than 1 and itself.
 * - The function checks divisibility starting from 2 up to sqrt(n).
 *
 * Time Complexity: O(√n) (as it only checks divisibility up to sqrt(n)).
 *
 * param n The number to check for primality.
 * param i The divisor (starts from 2).
 * @return True if the number is prime, False otherwise.
 */
public class IsPrime {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n, 2) ? "Prime" : "Composite");
        scanner.close();
    }
}
