package LinkedList;

import LinkedList.SingleLL.Node;

public class reversedLLiterative {
	Node head;
	private int size;
	
	reversedLLiterative(){
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		
		//constructor
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//add-first
	public void addFirst(String data) {
		Node newNode = new Node(data); //create Firstnode
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;  //if LL alraedy exist
		head = newNode;
	}
	
	//add in last
	public void addLast(String data) {
		Node newNode = new Node(data); //create Firstnode
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;   //traverse
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	//print
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode = head;   //traverse
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
		
	}
	
	//delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("This list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.next == null) {  //if only 1 node
			head = null;
			return;
			
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	public int getSize() {
		return size;
	}
	//reverse using iterative method
	public void reverseIterate() {
		if(head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
		
	}

	public static void main(String[] args) {
		reversedLLiterative list = new reversedLLiterative();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("list");
		list.addFirst("This");
		list.printList();
		

		list.reverseIterate();
		list.printList();
		
		

	}

}
