public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string with spaces and mixed case
        String input = "Never Odd Or Even";

        // Step 1: Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Step 2: Compare characters
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (ignoring case and spaces).");
        } 
        else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}