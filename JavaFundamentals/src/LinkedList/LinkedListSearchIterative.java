package LinkedList;

public class LinkedListSearchIterative {

    // Node class to represent each node in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail pointers for the linked list
    private Node head;
    private Node tail;
    private static int size;

    // Add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {  // If the list is empty
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Search for a key iteratively in the linked list
    public int searchIterative(int key) {
        // Start from the head of the list
        Node current = head;
        
        // Initialize the position index, starting from 0 (assuming positions are 0-based)
        int position = 0;

        // Traverse through the linked list
        while (current != null) {
            // Check if the current node's data matches the key
            if (current.data == key) {
                return position;  // Return the position where the key is found
            }
            // Move to the next node
            current = current.next;

            // Increment the position index
            position++;
        }

        // If the key was not found in the list, return -1
        return -1;
    }

    public static void main(String[] args) {
    	LinkedListSearchIterative ll = new LinkedListSearchIterative();

        // Add nodes to the linked list
        ll.addLast(10);
        ll.addLast(15);
        ll.addLast(25);
        ll.addLast(30);
        ll.addLast(40);

        // Display the linked list
        ll.display();  // Output: 10 -> 15 -> 25 -> 30 -> 40 -> null

        // Search for a key
        int key = 20;
        int position = ll.searchIterative(key);
        if (position != -1) {
            System.out.println("Key " + key + " found at position: " + position);
        } else {
            System.out.println("Key " + key + " not found.");
        }

        // Search for a key that exists in the list
        key = 25;
        position = ll.searchIterative(key);
        if (position != -1) {
            System.out.println("Key " + key + " found at position: " + position);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}

/*
 * Detailed Explanation:
current = head: This line sets current to point to the first node in the linked list (the head). It doesn’t create a new node, but rather references the existing nodes.

While Loop: In the while (current != null) loop, current moves from one node to the next by following the .next pointer of each node in the list. It starts at the head and keeps advancing to the next node using current = current.next.

Temporary Node: Since we don't want to modify the actual head pointer while traversing the list, we use current as a temporary pointer. It allows us to walk through the linked list without altering the structure of the list itself.

In summary:
current is a temporary reference that moves through the list node by node, checking each node's data to see if it matches the key we are searching for.
It is not creating new nodes but is simply a pointer that helps us iterate through the existing nodes.
 * 
 * 
 * Assume this is your linked list:
 * 10 -> 15 -> 25 -> 30 -> 40 -> null

When you start with current = head, it works like this:

Initially, current points to 10 (the head node).
In each iteration, current moves to the next node in the list:
1st iteration: current = 10
2nd iteration: current = 15
3rd iteration: current = 25
4th iteration: current = 30
5th iteration: current = 40
Eventually, current becomes null, meaning you’ve reached the end of the list.
By using this temporary pointer (current), you can safely traverse the list without affecting the original structure of the linked list.
 */
