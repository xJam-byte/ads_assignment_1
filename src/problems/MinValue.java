package problems;

import java.util.Scanner;

/**
 * This method finds the minimum value in an array using recursion.
 *
 * Approach:
 * - The function compares the last element with the minimum of the rest of the array.
 * - The recursion reduces the problem size by 1 in each call.
 *
 * Time Complexity: O(n), where n is the number of elements in the array.
 *
 * param arr The array of integers.
 * param n The number of elements in the array.
 * @return The minimum value in the array.
 */
public class MinValue {
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println(findMin(arr, n));
        scanner.close();
    }
}
