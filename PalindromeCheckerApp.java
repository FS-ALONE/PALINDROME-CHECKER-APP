import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "level";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both data structures
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while(!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if(fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if(isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } 
        else {
            System.out.println(word + " is NOT a Palindrome.");
        }

    }
}