import java.util.*;

public class PalindromeCheckerApp {

    // Two-pointer approach
    public static boolean twoPointerCheck(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack approach
    public static boolean stackCheck(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    // Deque approach
    public static boolean dequeCheck(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Two-pointer timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long end2 = System.nanoTime();

        // Deque timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(word);
        long end3 = System.nanoTime();

        System.out.println("Word: " + word);
        System.out.println();

        System.out.println("Two-Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println();

        System.out.println("Deque Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}