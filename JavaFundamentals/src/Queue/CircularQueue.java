package Queue;

public class CircularQueue {
    // Inner static class to implement the queue operations
    static class Queue {
        // Static variables to hold queue data and indices
        static int arr[];    // Array to store queue elements
        static int size;     // Maximum size of the queue
        static int rear;     // Points to the last element in the queue
        static int front;    // Points to the first element in the queue
        
        // Constructor to initialize the queue with a given size
        Queue(int n) {
            arr = new int[n];  // Initialize the array with size n
            size = n;          // Set the size of the queue
            rear = -1;         // Initialize rear index to -1 (queue is empty)
            front = -1;        // Initialize front index to -1 (queue is empty)
        }
        
        // Method to check if the queue is empty
        public static boolean isEmpty() {
            // Queue is empty if both front and rear are -1
            return rear == -1 && front == -1;
        }
        
        // Method to check if the queue is full
        public static boolean isFull() {
            // Queue is full when the next position of rear is front
            // Using (rear + 1) % size maintains the circular nature
            return (rear + 1) % size == front;
        }
        
        // Method to add an element to the queue
        public static void add(int data) {
            // Check if the queue is full before adding
            if (isFull()) {
                System.out.println("Queue is full");
                return; // Exit if the queue is full
            }
            // Check if the queue is empty
            if (front == -1) {
                front = 0; // Setting front to 0 when adding the first element
            }
            // Update rear to the next position in a circular manner
            rear = (rear + 1) % size;
            arr[rear] = data; // Add the new data to the rear position
        }
        
        // Method to remove an element from the queue
        public static int remove() {
            // Check if the queue is empty before removing
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1; // Return -1 if the queue is empty
            }
            
            int result = arr[front]; // Store the front element to return later
            
            // Check if this is the last element in the queue
            if (rear == front) {
                // Reset front and rear if this was the last element
                rear = front = -1;
            } else {
                // Move front to the next position in a circular manner
                front = (front + 1) % size;
            }
            return result; // Return the removed element
        }
        
        // Method to get the front element of the queue without removing it
        public static int peek() {
            // Check if the queue is empty before peeking
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1; // Return -1 if the queue is empty
            }
            return arr[front]; // Return the element at the front of the queue
        }
    }

    // Main method to test the CircularQueue functionality
    public static void main(String[] args) {
        Queue q = new Queue(5); // Create a new queue of size 5
        q.add(1); // Add element 1
        q.add(2); // Add element 2
        q.add(3); // Add element 3
        System.out.println(q.remove()); // Remove and print the first element (1)
        q.add(4); // Add element 4
        System.out.println(q.remove()); // Remove and print the next element (2)
        q.add(5); // Add element 5
        // Loop to print and remove all elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print the front element
            q.remove(); // Remove the front element
        }
    }
}
