package Stacks;

public class StackLinkedList {

    // Node class to represent each node in the linked list
    static class Node {
        int data;       // Data part of the node, stores the value of the node
        Node next;      // Pointer to the next node in the linked list

        // Constructor to initialize a new node
        public Node(int data) {
            this.data = data;    // Set the data of the node to the provided value
            this.next = null;    // Initialize the next pointer to null as this node is not connected yet
        }
    }

    // Stack class implementing the stack using linked list
    static class Stack {
        // Head node of the stack (top of the stack)
        // Initially set to null, indicating the stack is empty (no nodes are present)
        static Node head = null;

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            // The stack is empty when the head pointer is null
            // If head is null, it means no elements are present in the stack
            return head == null;
        }

        // Push operation: Adds a new element to the top of the stack
        public static void push(int data) {
            // Create a new node with the given data
            Node newNode = new Node(data);

            // If the stack is empty (head is null), set the new node as the head
            if (isEmpty()) {
                head = newNode;  // The new node becomes the first and top node of the stack
                return;          // Exit the function after setting the new node as head
            }

            // Otherwise, link the new node to the current head and update the head
            // The new node will point to the current top node, effectively pushing it onto the stack
            newNode.next = head; // The new node's next pointer is set to the current head node
            head = newNode;      // Update head to the new node, making it the new top of the stack
        }

        // Pop operation: Removes and returns the top element of the stack
        public static int pop() {
            // Check if the stack is empty before attempting to pop
            if (isEmpty()) {
                System.out.println("Stack is empty"); // Inform that the stack is empty
                return -1; // Return -1 as an error value when the stack is empty, indicating no element to pop
            }

            // Store the data of the current top element (head node)
            int top = head.data;

            // Move the head pointer to the next node, effectively removing the top node from the stack
            head = head.next; // This operation makes the next node the new top of the stack

            // Return the popped element
            return top;
        }

        // Peek operation: Returns the top element of the stack without removing it
        public static int peek() {
            // Check if the stack is empty before peeking
            if (isEmpty()) {
                System.out.println("Stack is empty"); // Inform that the stack is empty
                return -1; // Return -1 as an error value when the stack is empty, indicating no element to peek
            }

            // Return the data of the current top element (head node)
            return head.data; // Peek only returns the value of the head node without modifying the stack
        }
    }

    public static void main(String[] args) {
        // Create a new stack instance
        Stack s = new Stack();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        s.push(1);  // Pushes 1 onto the stack, making it the top element
        System.out.println("Pushed: 1");
        s.push(2);  // Pushes 2 onto the stack, making it the new top element
        System.out.println("Pushed: 2");
        s.push(3);  // Pushes 3 onto the stack, making it the new top element
        System.out.println("Pushed: 3");

        // Display the top element and pop elements from the stack
        System.out.println("\nDisplaying and popping elements from the stack:");
        while (!s.isEmpty()) {
            // Display the current top element using peek()
            System.out.println("Top element: " + s.peek());

            // Remove and display the top element using pop()
            System.out.println("Popped: " + s.pop());
        }

        // Try popping from an empty stack to see the handling of empty state
        System.out.println("\nTrying to pop from an empty stack:");
        System.out.println("Popped element: " + s.pop()); // Output: Stack is empty, Popped element: -1

        // Try peeking from an empty stack to see the handling of empty state
        System.out.println("\nTrying to peek into an empty stack:");
        System.out.println("Top element is: " + s.peek()); // Output: Stack is empty, Top element is: -1
    }
}
