public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        // Reverse the String
        String reversed = new StringBuilder(word).reverse().toString();

        // Palindrome Check using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}