package LinkedList;



public class LinkedListRemoveFirst {
	
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
		    if (size == 0) {  // Check if the list is empty
		        System.out.println("LL is empty");
		        return Integer.MIN_VALUE;  // Return a special value to indicate an error
		    }

		    int val = head.data;  // Store the value of the node being removed

		    // If there's only one node, set both head and tail to null
		    if (head == tail) {
		        head = tail = null;
		    } else {
		        head = head.next;  // Move the head pointer to the next node
		    }

		    size--;  // Decrease the size of the list
		    return val;  // Return the value of the removed node
		}
	  
	  


	  
	public static void main(String[] args) {
		LinkedListRemoveFirst ll = new LinkedListRemoveFirst();
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
	}

}
