import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /*
        *
        * USE CASE 5:
        *
        *This program checks whether the string is palindrome using stack and displays
        * the result
        *
        @author: Jeyanth_S
        @version: v1.5
         */

        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}
