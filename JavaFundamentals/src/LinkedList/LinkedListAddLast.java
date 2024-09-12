package LinkedList;

public class LinkedListAddLast {
	    
	    // Node class to represent each node in the linked list
	    private static class Node {
	        int data;   // This will hold the data for each node
	        Node next;  // This reference points to the next node in the list

	        // Constructor to create a new node with the given data
	        public Node(int data) {
	            this.data = data;     // Assign the given data to the node
	            this.next = null;     // The next reference is initially null (no next node)
	        }
	    }

	    private Node head;  // Reference to the first node (head) of the linked list
	    private Node tail;  // Reference to the last node (tail) of the linked list

	    // Method to add a new node at the end of the list
	    public void addLast(int data) {
	        // Step 1: Create a new node with the given data
	        Node newNode = new Node(data);  // Create a new node object with the provided data
	        
	        // Step 2: Check if the list is empty
	        if (tail == null) {
	            // If the list is empty (head and tail are both null), 
	            // set both head and tail to point to the new node
	            head = newNode;  // The head now points to the first and only node
	            tail = newNode;  // The tail also points to the same node since it's the only one
	        } else {
	            // If the list is not empty, link the current last node (tail) to the new node
	            tail.next = newNode;  // The current tail's next reference points to the new node

	            // Step 3: Update the tail to point to the new node, making it the last node
	            tail = newNode;  // Tail is updated to point to the new node, which is now the last node
	        }
	    }

	    // Method to display the linked list starting from the head
	    public void display() {
	        Node current = head;  // Start from the first node (head)
	        
	        // Traverse the list until we reach the end (null)
	        while (current != null) {
	            System.out.print(current.data + " -> ");  // Print the data of the current node
	            current = current.next;  // Move to the next node in the list
	        }
	        
	        // After the last node, print null to indicate the end of the list
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        LinkedListAddLast list = new LinkedListAddLast();  // Create an empty linked list

	        // Adding nodes to the end of the list using addLast
	        list.addLast(10);  // Adds 10 to the end of the list
	        list.addLast(20);  // Adds 20 to the end of the list
	        list.addLast(30);  // Adds 30 to the end of the list

	        // Display the final linked list
	        System.out.println("Linked List:");
	        list.display();  // Output: 10 -> 20 -> 30 -> null
	    }

	}
