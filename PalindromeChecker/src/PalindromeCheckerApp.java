import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /*
        *
        * USE CASE 3:
        *
        *This program can now get a string from the user and checks whether the string is palindrome, and displays
        * the result
        *
        @author: Jeyanth_S
        @version: v1.2
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Check palindrome
        if (text.equals(reversed)) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is Not a Palindrome.");
        }
        sc.close();

    }
}
