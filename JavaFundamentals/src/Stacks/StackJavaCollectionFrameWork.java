package Stacks;

import java.util.Stack; // Importing the Stack class from Java's Collections Framework

public class StackJavaCollectionFrameWork {

    public static void main(String[] args) {

        // Creating a Stack object of Integer type
        // Reason: The Stack class provides built-in methods for stack operations like push, pop, peek, and isEmpty
        Stack<Integer> s = new Stack<>();

        // Pushing elements onto the stack
        s.push(1); // Adds 1 to the stack; 1 is now the top element
        s.push(2); // Adds 2 to the stack; 2 becomes the new top element
        s.push(3); // Adds 3 to the stack; 3 is now the top element

        // Using a loop to display and remove elements from the stack until it is empty
        // Reason: The loop uses isEmpty() to check if the stack has any elements left, preventing exceptions
        while (!s.isEmpty()) { // isEmpty() is a built-in method of the Stack class that checks if the stack is empty
            // Peek operation: Display the top element of the stack without removing it
            // Reason: peek() lets us view the top element to confirm it before popping
            System.out.println("Top element is: " + s.peek());

            // Pop operation: Removes the top element of the stack
            // Reason: pop() removes and returns the element at the top, demonstrating the LIFO behavior
            s.pop();
        }

        // Attempting to pop from an empty stack would cause an EmptyStackException
        // Why: Demonstrates the importance of checking stack state with isEmpty() to handle corner cases
        // Stack should be empty at this point; no further pop/peek operations should be performed without checking
    }
}


