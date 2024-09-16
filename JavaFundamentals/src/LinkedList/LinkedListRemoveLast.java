package LinkedList;



public class LinkedListRemoveLast {
	
	public static class Node{
		
		int data; 
		Node next;
		
		public Node(int data) {
			this.data= data;
			this.next= null;
		}
	}
	private Node head;
	private Node tail;
	private static int size;
	
	 public void addFirst(int data) {
	        Node newNode = new Node(data);
	        size++;
	        if(head == null) {
	        	head= tail= newNode;
	        	return;
	        }
	        newNode.next = head; 
	        head = newNode;  
	    }

	 public void AddLast(int data) {
			Node newNode = new Node(data);
			size++;
			if(tail == null) {
				head = newNode;
				tail = newNode;
			}else {
			tail.next = newNode; // connection with initial B
			tail = newNode; // update the tail 
			}
		}
	 
	  public void insertAtPosition(int index, int data) {
	        Node newNode = new Node(data);
	        size++;
	        if (index == 0) {
	            newNode.next = head;  
	            head = newNode;       
	            return;               
	        }
	        
	        Node current = head;      
	        int currentPosition = 0;  

	       
	        while (current != null && currentPosition < index - 1) {
	            current = current.next; 
	            currentPosition++;       
	        }
	        
	      
	        if (current != null) {
	            newNode.next = current.next;  
	            current.next = newNode;     
	        } else {
	            System.out.println("Index out of bounds");
	        }
	    }
	  
	  public void display() {
	        Node current = head;  
	        
	       
	        while (current != null) {
	            System.out.print(current.data + " -> ");  
	            current = current.next;  
	        }
	       
	        System.out.println("null");
	    }
	 
	  public int removeFirst() {
		    if (size == 0) { 
		        System.out.println("LL is empty");
		        return Integer.MIN_VALUE;  
		    }

		    int val = head.data; 

		   
		    if (head == tail) {
		        head = tail = null;
		    } else {
		        head = head.next; 
		    }

		    size--;  
		    return val;  
		}

	  public int removeLast() {
		    // Check if the list is empty
		    if (size == 0) {
		        System.out.println("LL is empty");
		        return Integer.MIN_VALUE;  // Return a special value to indicate an error
		    }

		    // Store the value of the last node (tail) to return it later
		    int val = tail.data;

		    // If there's only one node in the list (i.e., head == tail)
		    if (head == tail) {
		        // Set both head and tail to null, effectively emptying the list
		        head = tail = null;
		    } else {
		        // Start from the head to find the second-to-last node
		        Node prev = head;

		        // Traverse the list until prev.next is the current tail
		        // This loop moves the prev pointer to the node just before the tail
		        while (prev.next != tail) {
		            prev = prev.next;
		        }

		        // After the loop, prev is now the second-to-last node
		        // Remove the last node by setting prev.next to null
		        prev.next = null;

		        // Update the tail to point to the second-to-last node (prev)
		        tail = prev;
		    }

		    // Decrease the size of the list after removing the last node
		    size--;

		    // Return the value of the removed node (old tail)
		    return val;
		}


	  
	public static void main(String[] args) {
		LinkedListRemoveLast ll = new LinkedListRemoveLast();
	ll.addFirst(2);
	ll.addFirst(1);
	ll.AddLast(4);
	ll.AddLast(5);
	ll.insertAtPosition(2, 3);
	ll.display();
//	System.out.println(LinkedListRemoveFirst.size);
	 int removedValue = ll.removeFirst();
     System.out.println("Removed value: " + removedValue);

	ll.display();
	ll.removeLast();
	ll.display();
	System.out.println("Now the size becomes: " + ll.size);
	}

}
