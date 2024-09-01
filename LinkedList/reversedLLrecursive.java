package LinkedList;

public class reversedLLrecursive {
    Node head;
    private int size;
    
    // Node class
    class Node {
        String data;
        Node next;
        
        // Constructor
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    // Constructor
    public reversedLLrecursive() {
        this.size = 0;
    }
    
    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }
    
    // Print List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    
    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    
    public int getSize() {
        return size;
    }
    
    // Reverse using Iterative method
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }
    
    // Recursive Reverse
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public static void main(String[] args) {
    	reversedLLrecursive list = new reversedLLrecursive();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
