
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /*
        *
        * USE CASE 4:
        *
        *This program checks whether the string is palindrome based on character array, and displays
        * the result
        *
        @author: Jeyanth_S
        @version: v1.4
         */

        // Declare and initialize the input string.
        String input = "radar";

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
