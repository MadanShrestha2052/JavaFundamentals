package LinkedList;

public class LinkedListInsert {

	    
	    // Node class representing each node in the list
	    private static class Node {
	        int data;  // Data stored in the node
	        Node next; // Reference to the next node

	        // Constructor for Node
	        public Node(int data) {
	            this.data = data;
	            this.next = null; // By default, the next node is null
	        }
	    }

	    private Node head;  // Reference to the head of the linked list

	    // Method to insert a new node at a specific position in the list
	    public void insertAtPosition(int index, int data) {
	        Node newNode = new Node(data); // Step 1: Create the new node with data
	        
	        // Step 2: Handle special case where node is added at the start of the list (index 0)
	        if (index == 0) {
	            newNode.next = head;  // Link newNode to the current head
	            head = newNode;       // Update head to point to newNode
	            return;               // Return early as we're done
	        }
	        
	        Node current = head;      // Set up temporary reference starting at head
	        int currentPosition = 0;  // Track the current index during traversal

	        // Step 3: Traverse to the previous node (at index - 1)
	        while (current != null && currentPosition < index - 1) {
	            current = current.next;  // Move to the next node
	            currentPosition++;       // Increment position
	        }
	        
	        // Step 4: Insert the new node if valid position found
	        if (current != null) {
	            newNode.next = current.next;  // Set newNode's next to the current node's next
	            current.next = newNode;       // Link current node to newNode
	        } else {
	            System.out.println("Index out of bounds"); // Handle invalid index
	        }
	    }

	    // Method to display the linked list
	    public void display() {
	        Node current = head; // Start from the head
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next; // Move to the next node
	        }
	        System.out.println("null"); // End of the list
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	    	LinkedListInsert list = new LinkedListInsert();

	        // Add nodes at different positions
	        list.insertAtPosition(0, 10);  // Insert at index 0 (beginning)
	        list.insertAtPosition(1, 20);  // Insert at index 1 (end)
	        list.insertAtPosition(2, 30);  // Insert at index 2 (end again)
	        list.insertAtPosition(1, 15);  // Insert at index 1 (middle)

	        // Display the final list
	        System.out.println("Final Linked List:");
	        list.display();
	    }
	}
	
