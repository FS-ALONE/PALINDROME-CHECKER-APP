public class PalindromeChecker {

    // Application Version Constant
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "1.0";

    // Entry Point of JVM
    public static void main(String[] args) {

        // Application Startup Flow
        displayWelcomeMessage();

        // Flow Control: Continue or Exit
        System.out.println("\nApplication initialized successfully.");
        System.out.println("Proceeding to next use case...");
    }

    // Method to Display Welcome Details
    private static void displayWelcomeMessage() {
        System.out.println("========================================");
        System.out.println("        WELCOME TO PALINDROME CHECKER");
        System.out.println("========================================");
        System.out.println("Application Name : " + APP_NAME);
        System.out.println("Application Version : " + APP_VERSION);
    }