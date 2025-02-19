package Stacks;
import java.util.Stack;

public class PushAtBottomHierarchy {

    // Simulates the initial call from main
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // Start the recursive process by calling the first function
        pushAtBottomAlpha1(s, 4); // Represents the initial call pushAtBottom(s, 4)

        // Print the stack to see the final result
        while (!s.isEmpty()) {
            System.out.println(s.pop()); // Should print: 3, 2, 1, 4
        }
    }

    // First level of recursion (Alpha-1)
    public static void pushAtBottomAlpha1(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Pops the top element (3) and makes the next recursive call
        int top = s.pop(); // top = 3, Stack state: [1, 2]
        pushAtBottomAlpha2(s, data); // Simulates Beta-1 call
        s.push(top); // s.push(3), Stack state after resuming: [4, 1, 2, 3]
    }

    // Second level of recursion (Alpha-2)
    public static void pushAtBottomAlpha2(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Pops the next element (2) and makes the next recursive call
        int top = s.pop(); // top = 2, Stack state: [1]
        pushAtBottomAlpha3(s, data); // Simulates Beta-2 call
        s.push(top); // s.push(2), Stack state after resuming: [4, 1, 2]
    }

    // Third level of recursion (Alpha-3)
    public static void pushAtBottomAlpha3(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Pops the next element (1) and makes the final recursive call
        int top = s.pop(); // top = 1, Stack state: []
        pushAtBottomBase(s, data); // Simulates Beta-3 call
        s.push(top); // s.push(1), Stack state after resuming: [4, 1]
    }

    // Base case (Beta-3)
    public static void pushAtBottomBase(Stack<Integer> s, int data) {
        // This is where the base case is hit
        if (s.isEmpty()) {
            s.push(data); // Base case action: push 4
            return; // Returns control to the paused Alpha-3
        }
    }
}
