package LinkedList;

public class LinkedList {

    // Node class to represent each element in the linked list
    // This is a private static nested class, used only by LinkedList
    private static class Node {
        int data;   // Data stored in the node (in this case, an integer)
        Node next;  // Reference to the next node in the linked list

        // Constructor to create a new node with the given data
        public Node(int data) {
            this.data = data;  // Assign the value passed in to the node's data field
            this.next = null;  // By default, the next node is null (this is the last node for now)
        }
    }

    // The head node is the first node of the list.
    // Initially, the list is empty, so head is null.
    private Node head;

    /**
     * Adds a new node to the beginning of the linked list.
     * This method inserts a node as the new "head" of the list.
     *
     * @param data The value to be stored in the new node.
     */
    public void addFirst(int data) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);  // Create a new node with the given data
        
        // Step 2: Point the new node's "next" to the current head of the list
        // This connects the new node to the rest of the list
        newNode.next = head;  // Set the new node's next to the current head (which could be null if the list is empty)
        
        // Step 3: Update the head to be the new node
        // The new node is now the first node in the list
        head = newNode;  // Make the new node the new head of the list
    }

    /**
     * Displays the contents of the linked list.
     * This method traverses the list from the head and prints each node's data.
     */
    public void display() {
        // Start at the head node
        Node current = head;  // Use a temporary pointer (current) to traverse the list
        
        // Step through each node until we reach the end (null)
        while (current != null) {
            // Print the data in the current node
            System.out.print(current.data + " -> ");
            
            // Move to the next node
            current = current.next;
        }
        
        // After printing all nodes, print "null" to indicate the end of the list
        System.out.println("null");
    }

    // Main method to demonstrate the functionality of the LinkedList
    public static void main(String[] args) {
        // Create a new LinkedList object
        LinkedList list = new LinkedList();

        // Add nodes to the beginning of the list
        // Each call to addFirst() inserts a new node at the head of the list
        list.addFirst(30);  // The list now looks like: 30 -> null
        list.addFirst(20);  // The list now looks like: 20 -> 30 -> null
        list.addFirst(10);  // The list now looks like: 10 -> 20 -> 30 -> null

        // Display the current state of the linked list
        System.out.print("Linked List: ");
        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}

/**
 * Description of How Display works:
 * Clarification:
current is still just a reference to a Node, not the actual node itself.
When you write current.data or current.next, you're accessing the data or the next reference of the node that current is pointing to.
How does this work?
In Java, references point to objects stored in memory. When we say current is a reference of type Node, it means that current holds the memory address (or reference) of a Node object. So when you access current.data or current.next, you're really accessing the fields of the Node object that current is pointing to.

Explanation in Steps:
current = head;:

current is a reference that holds the same memory address as head. This means current is pointing to the same node that head is pointing to (let's say Node A).
current does not have its own data or next. It's simply a pointer to a Node object that has these properties.
current.data:

When you write current.data, you're asking Java to:
Go to the memory location that current points to (which is a Node object).
Access the data field of that Node.
Since current is pointing to Node A, and Node A has data = 20, current.data returns 20.
current.next:

Similarly, when you write current.next, you're asking Java to:
Go to the memory location that current points to.
Access the next field of that Node.
If current is pointing to Node A, and Node A's next points to Node B, then current.next gives you a reference to Node B.
Updating current to current.next:

When you write current = current.next;, you are moving current to point to the next node.
current is now updated to point to whatever current.next was pointing to (e.g., Node B).
 */
