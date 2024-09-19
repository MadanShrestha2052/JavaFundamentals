package LinkedList;

public class LinkedListReverse {

    // Node class to represent each node in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;       // Initialize prev to null
        Node current = head;    // Start with the current node as head
        Node next = null;       // Next will help in traversal
        
        // Traverse through the list and reverse the links
        while (current != null) {
            next = current.next;  // Store the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move prev to this node (current)
            current = next;       // Move to the next node in the list
        }
        
        // After the loop, prev will be the new head
        head = prev;
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

    public static void main(String[] args) {
        LinkedListReverse ll = new LinkedListReverse();

        // Add nodes to the linked list
        ll.addLast(10);
        ll.addLast(15);
        ll.addLast(25);
        ll.addLast(30);
        ll.addLast(40);

        // Display the linked list before reversal
        System.out.println("Original List:");
        ll.display();  // Output: 10 -> 15 -> 25 -> 30 -> 40 -> null

        // Reverse the linked list
        ll.reverse();

        // Display the linked list after reversal
        System.out.println("Reversed List:");
        ll.display();  // Output: 40 -> 30 -> 25 -> 15 -> 10 -> null
    }
}

