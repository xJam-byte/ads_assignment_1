import java.util.Scanner;

/**
 *
 * Approach:
 * - Base case: An empty string or a single character is already reversed.
 * - Recursive case: Take the last character + reverse the rest of the string.
 *
 * Time Complexity: O(n), where n is the length of the string.
 *
 * param str The input string.
 * @return The reversed string.
 */
public class ReverseString {
    public static String reverse(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverse(str));
        scanner.close();
    }
}
