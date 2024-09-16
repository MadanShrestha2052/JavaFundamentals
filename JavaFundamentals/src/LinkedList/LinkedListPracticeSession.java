package LinkedList;

public class LinkedListPracticeSession {
	
	public static class Node{
		
		private int data;
		private Node next;
		
		public Node (int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head;
	private Node tail;
	
	public void AddFirst(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}
	public void AddLast(int data) {
		Node newNode = new Node(data);
		
		if(tail == null) {
			head = newNode;
			tail = newNode;
		}else {
		tail.next = newNode; // connection with initial B
		tail = newNode; // update the tail 
		}
	}
	
	public void displayAll() {
		Node tempNod = head;
		while(tempNod != null) {
			System.out.print(tempNod.data + "-->");
			tempNod= tempNod.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		LinkedListPracticeSession linkingList = new LinkedListPracticeSession();
		System.out.println("Using AddFirst");
		linkingList.AddFirst(5);
		linkingList.AddFirst(4);
		linkingList.AddFirst(3);
		linkingList.AddFirst(2);
		linkingList.AddFirst(1);
		linkingList.displayAll();
		
		linkingList.AddLast(6);
		linkingList.AddLast(7);
		linkingList.AddLast(8);
		linkingList.displayAll();
	}

}
