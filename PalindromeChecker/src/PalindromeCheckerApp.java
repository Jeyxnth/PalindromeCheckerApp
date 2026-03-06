import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC10) ===");

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string is a PALINDROME (ignoring spaces and case).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        input.close();
    }
}