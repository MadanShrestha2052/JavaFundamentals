package LinkedList;

public class LinkedListSearchRecursive {

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

    // Recursive search for a key in the linked list
    public int searchRecursive(Node current, int key, int position) {
        // Base case 1: if the current node is null, we've reached the end of the list
        // and the key was not found, so return -1.
        if (current == null) {
            return -1;  // Key not found
        }

        // Base case 2: if the current node's data matches the key, return the position.
        if (current.data == key) {
            return position;  // Key found
        }

        // Recursive call: move to the next node and increment the position
        return searchRecursive(current.next, key, position + 1);
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
        LinkedListSearchRecursive ll = new LinkedListSearchRecursive();

        // Add nodes to the linked list
        ll.addLast(10);
        ll.addLast(15);
        ll.addLast(25);
        ll.addLast(30);
        ll.addLast(40);

        // Display the linked list
        ll.display();  // Output: 10 -> 15 -> 25 -> 30 -> 40 -> null

        // Recursive search for a key
        int key = 25;
        int position = ll.searchRecursive(ll.head, key, 0);
        if (position != -1) {
            System.out.println("Recursive: Key " + key + " found at position: " + position);
        } else {
            System.out.println("Recursive: Key " + key + " not found.");
        }
    }
}


/**
 * In recursive search, the function keeps calling itself and traversing through the linked list until it hits one of the two base cases:

Key is found:
When current.data == key, the recursion stops and returns the position where the key was found.
End of the list (key not found):
When current == null (i.e., we reach the end of the list), it returns -1, indicating that the key was not found.
Each recursive call goes deeper into the list, advancing one node at a time, and the position is incremented with each call. Eventually, when one of the base cases is met, the recursion starts to unwind and the final position (or -1 if not found) is returned.

Key Points:
The recursion continues, moving through the list node by node, until one of the base cases is met.
If the key is found, the position is returned through the recursive calls.
If the key is not found, -1 is returned.
This ensures that the function always returns either the position of the key if found, or -1 if the key doesn't exist in the list.
 * 
 */
