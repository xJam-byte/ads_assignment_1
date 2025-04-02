package problems;

import java.util.Scanner;

/**
 *
 * Approach:
 * - The function accumulates the sum and divides by the number of elements.
 * - Uses the formula: (previous sum * (n - 1) + current value) / n.
 *
 * Time Complexity: O(n), where n is the number of elements.
 *
 * param arr The array of integers.
 * param n The number of elements in the array.
 * @return The average of the array elements.
 */
public class Average {
    public static double findAverage(int[] arr, int n) {
        if (n == 1) return arr[0];
        return (findAverage(arr, n - 1) * (n - 1) + arr[n - 1]) / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.printf("%.2f\n", findAverage(arr, n));
        scanner.close();
    }
}
