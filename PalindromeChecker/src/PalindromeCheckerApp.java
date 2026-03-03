import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /*
        *
        * USE CASE 2:
        *
        *This program can now get a string from the user and checks whether the string is palindrome, and displays
        * the result
        *
        @author: Jeyanth_S
        @version: v1.1
         */

        String text = "madam";

        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
        System.out.println("Program Ended.");
    }
}
