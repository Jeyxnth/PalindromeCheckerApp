import java.util.Scanner;
public class UseCase11PalindromeCheckerApp {
    /**
     * USE CASE:11
     * This program can get an input from the user and check whether the string is a palindrome or not using
     * Encapsulation.
     *
     * @Author: Jeyanth_S
     * @Version: v1.11
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome check
        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a PALINDROME.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}