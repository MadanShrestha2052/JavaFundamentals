package Stacks;

import java.util.ArrayList;

public class StackArrayList {

    // Inner Stack class using ArrayList to store elements
    static class Stack {
        // ArrayList to hold stack elements
        static ArrayList<Integer> list = new ArrayList<>();

        // Push operation: Adds an element to the top of the stack
        public void push(int data) {
            list.add(data); // Adds the element to the end of the list, which represents the top of the stack
        }

        // Pop operation: Removes and returns the top element of the stack
        public int pop() {
            // Check if the stack is empty before attempting to pop
            if (isEmpty()) {
                System.out.println("Stack is empty"); // Inform that the stack is empty
                return -1; // Return -1 as an error value when the stack is empty
            }
            int top = list.get(list.size() - 1); // Get the last element (top of the stack)
            list.remove(list.size() - 1); // Remove the last element from the list
            return top; // Return the popped element
        }

        // Peek operation: Returns the top element of the stack without removing it
        public int peek() {
            // Check if the stack is empty before attempting to peek
            if (isEmpty()) {
                System.out.println("Stack is empty"); // Inform that the stack is empty
                return -1; // Return -1 as an error value when the stack is empty
            }
            return list.get(list.size() - 1); // Return the last element (top of the stack)
        }

        // isEmpty operation: Checks if the stack is empty
        public boolean isEmpty() {
            return list.isEmpty(); // Returns true if the list is empty, false otherwise
        }
    }

    public static void main(String[] args) {
        // Create a new stack instance
        Stack stack = new Stack();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        System.out.println("Pushed: 10");
        stack.push(20);
        System.out.println("Pushed: 20");
        stack.push(30);
        System.out.println("Pushed: 30");

        // Display the top element using peek
        System.out.println("\nTop element is: " + stack.peek()); // Output: Top element is: 30

        // Pop elements from the stack and display them
        System.out.println("\nPopping elements from the stack:");
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 30
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 20

        // Check if the stack is empty
        System.out.println("\nIs the stack empty? " + stack.isEmpty()); // Output: Is stack empty? false

        // Pop the last element
        System.out.println("\nPopped element: " + stack.pop()); // Output: Popped element: 10

        // Check if the stack is empty after popping all elements
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: Is stack empty? true

        // Try popping from an empty stack to see the handling of empty state
        System.out.println("\nTrying to pop from an empty stack:");
        System.out.println("Popped element: " + stack.pop()); // Output: Stack is empty, Popped element: -1

        // Try peeking from an empty stack to see the handling of empty state
        System.out.println("\nTrying to peek into an empty stack:");
        System.out.println("Top element is: " + stack.peek()); // Output: Stack is empty, Top element is: -1
    }
}


/**
 * Detailed Explanation of the Code:
Class and Inner Stack Class:

StackArrayList is the main class, and it contains a static inner class Stack that defines the stack's behavior using an ArrayList.
ArrayList<Integer> list:

The ArrayList acts as the underlying data structure for the stack, where elements are added and removed from the end, mimicking stack operations.
push(int data):

Adds an element to the stack. The element is added to the end of the list, which represents the top of the stack.
Complexity: O(1).
pop():

Removes and returns the top element of the stack.
Corner Case: Checks if the stack is empty before attempting to pop. If empty, it prints a message and returns -1.
Complexity: O(1).
peek():

Returns the top element without removing it.
Corner Case: Checks if the stack is empty. If empty, it prints a message and returns -1.
Complexity: O(1).
isEmpty():

Checks if the stack is empty by verifying if the list is empty.
Complexity: O(1).
Main Method Execution Flow:
Pushes 10, 20, and 30 onto the stack.
Displays the top element using peek().
Pops elements one by one and checks if the stack is empty.
Handles corner cases by trying to pop and peek from an empty stack.
Key Takeaways:
The code handles stack operations effectively with clear checks for empty states.
It uses all the stack functions (push, pop, peek, isEmpty) to demonstrate the stack's functionality.
Properly handles corner cases to ensure robustness and user-friendly messages when the stack is empty.
 * 
 */
