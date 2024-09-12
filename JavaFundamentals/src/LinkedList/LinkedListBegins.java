package LinkedList;

public class LinkedListBegins {
	

	    // Node class to represent each node in the linked list
	    private static class Node {
	        int data;  // Each node holds some data (an integer in this case)
	        Node next; // Each node also holds a reference to the next node in the list (or null if it's the last node)

	        // Constructor to create a new node with given data
	        public Node(int data) {
	            this.data = data; // Assign the given data to this node
	            this.next = null; // By default, the next reference is null because the node doesn't point to anything yet
	            // Why: We initialize next as null because when a node is first created, we don't know what it should point to.
	        }
	    }

	    // Reference to the first node in the list (head always points to the first node)
	    private Node head; // Why: head keeps track of the first node in the linked list; it is null when the list is empty

	    // Method to add a new node at the beginning of the list
	    public void addFirst(int data) {
	        // Step 1: Create a new node with the given data
	        Node newNode = new Node(data);  // Create a new node object with the given data
	        // Why: We need to add data to the list, so we first create a node that will store the data and have a reference to the next node.

	        // Step 2: The new node's next reference should have the value of head
	        // Why: Since the new node is going to be the first node, it needs to "link" to the current first node. 
	        // This is done by setting newNode.next to point to the node that head is currently pointing to.
	        newNode.next = head;

	        // Step 3: Now, update head to point to the new node, making it the new first node in the list
	        // Why: After adding the new node, we must update head to point to this new node, as head always points to the first node in the list.
	        head = newNode;
	    }

	    // Method to display the linked list, starting from the first node (head)
	    public void display() {
	        // Step 1: Start with the first node, which is pointed to by head
	        Node current = head;  // Initialize current as head to begin traversing the list
	        // Why: We use current to traverse the list without modifying head, so we don't lose the reference to the first node.

	        // Step 2: Traverse the list node by node
	        // Why: We'll keep moving to the next node until we reach the end of the list, where next is null
	        while (current != null) {
	            // Step 3: Print the data of the current node
	            System.out.print(current.data + " -> ");  // Print the data and the arrow to indicate connection to the next node
	            // Why: This prints the data in each node in sequence as we traverse the list.

	            // Step 4: Move to the next node
	            current = current.next;  // Update current to point to the next node in the list
	            // Why: By updating current to current.next, we move forward in the list. This will eventually bring us to the last node, where next is null.
	        }
	        System.out.println("null");  // Print "null" to signify the end of the linked list
	        // Why: Once we've reached the last node (current is null), we print null to indicate the list's termination.
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();  // Create an empty linked list (head is null by default)

	        // Adding nodes to the beginning of the list using addFirst
	        list.addFirst(10);  // Add the first node with data 10
	        // Why: This adds a new node to the list, making it the first node. Since the list was empty, head now points to this new node (10 -> null).

	        list.addFirst(20);  // Add a second node with data 20
	        // Why: A new node (20) is added, becoming the new first node. Now, head points to 20, and 20's next points to the previous first node (10 -> null).

	        list.addFirst(30);  // Add a third node with data 30
	        // Why: A new node (30) is added as the first node. Head is updated to point to 30, which points to 20, and 20 points to 10 (30 -> 20 -> 10 -> null).

	        // Display the linked list
	        System.out.println("Linked List:");
	        list.display();  // This will output: 30 -> 20 -> 10 -> null
	        // Why: Display method will print all nodes from the first to the last, showing how they are linked in order.
	    }
	}

/**
 * "now newNode.next has the value of head, which is pointing to Node A, the previous first node" is a much clearer way to express it. 
 * It emphasizes that newNode.next takes the current value of head (the reference to the first node) rather than making
 *  it sound like next points directly to head itself.
 * 
 */
