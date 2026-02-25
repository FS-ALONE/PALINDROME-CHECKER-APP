import java.util.Scanner;

public class PalindromeChecker {

    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        // ===== UC1: Application Entry =====
        System.out.println("====================================");
        System.out.println("      WELCOME TO PALINDROME CHECKER");
        System.out.println("====================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : " + APP_VERSION);
        System.out.println();

        // ===== UC2: User Input =====
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Preprocessing: remove spaces & convert to lowercase
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // ===== Palindrome Logic =====
        String reversed = new StringBuilder(processedInput).reverse().toString();

        if (processedInput.equals(reversed)) {
            System.out.println("\nResult: The given string is a PALINDROME.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        // ===== Application End =====
        System.out.println("\nThank you for using Palindrome Checker App.");
        scanner.close();
    }
}