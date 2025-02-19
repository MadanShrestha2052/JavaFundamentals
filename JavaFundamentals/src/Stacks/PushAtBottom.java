package Stacks;

import java.util.Stack;


public class PushAtBottom {

    // Method to push an element at the bottom of the stack using recursion
    // This method has a time complexity of O(N) due to recursive calls and space complexity of O(N) because of the call stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        
        // Base Case: If the stack is empty, push the data at the bottom
        if (s.isEmpty()) {
            s.push(data); // Push the element when the stack is empty
            return; // Exit the function after adding the element
        }
        
        // Recursive Step: Remove the top element and make a recursive call
        int top = s.pop(); // Store the top element and remove it
        pushAtBottom(s, data); // Recursively call to keep removing elements until the stack is empty
        
        // After recursion returns, push the stored element back onto the stack
        s.push(top); // Re-add the element after the base case has been handled
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1); // Stack: [1]
        s.push(2); // Stack: [1, 2]
        s.push(3); // Stack: [1, 2, 3]

        // Call the pushAtBottom function to add 4 at the bottom of the stack
        pushAtBottom(s, 4); // This will result in the stack: [4, 1, 2, 3]

        // Print the stack elements to verify the order after the operation
        System.out.println("Stack elements after pushing 4 at the bottom:");
        while (!s.isEmpty()) {
            System.out.println(s.pop()); // Outputs: 3, 2, 1, 4 (showing the stack from top to bottom)
        }
    }
}


/**
 * Key Points of the Optimized Code:
Base Case:

If the stack is empty, the data is pushed onto the stack. This is the simplest scenario where the element can directly be added at the bottom.
Recursive Call:

Each recursive call temporarily removes the top element and continues until the stack is empty.
The recursive process "pauses" at each level until the base case is reached.
Resumption and Rebuilding:

After the base case is handled, each call resumes, adding the previously removed elements back onto the stack in the correct order.
Time and Space Complexity:

Time Complexity: O(N), where N is the number of elements in the stack, because each element is processed once.
Space Complexity: O(N) due to the depth of the recursion, which depends on the number of elements in the stack.
Summary:
This code efficiently adds an element at the bottom of the stack using recursion without the need for additional data structures, preserving the order of existing elements.
The comments explain each step, making the code easy to understand and justifying why each action is taken.
Let me know if this optimized
 * 
 */
