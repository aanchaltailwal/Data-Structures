class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    
    // Detect and remove cycle
    public void detectAndRemoveCycle(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        
        Node slow = head, fast = head;
        boolean cycleDetected = false;

        // Detect cycle using Floyd's Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there's a cycle
            if (slow == fast) {
                cycleDetected = true;
                break;
            }
        }

        // If no cycle is detected, return
        if (!cycleDetected) {
            return;
        }

        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Now 'slow' and 'fast' point to the start of the cycle
        // Find the previous node of the start of the cycle
        Node prev = fast;
        while (prev.next != slow) {
            prev = prev.next;
        }

        // Remove the cycle
        prev.next = null;
    }
    
    // Utility function to print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to create a cycle for testing
    public Node createCycle(Node head, int pos) {
        if (head == null) return null;
        
        Node temp = head;
        Node cycleNode = null;
        int count = 0;
        
        // Traverse the list and mark the cycle node
        while (temp.next != null) {
            if (count == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }

        // Create a cycle
        if (cycleNode != null) {
            temp.next = cycleNode;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Create a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        // Create a cycle in the list (for example, at position 1)
        head = list.createCycle(head, 1);
        
        // Detect and remove the cycle
        list.detectAndRemoveCycle(head);
        
        // Print the modified list
        list.printList(head);  // Output should be: 1 2 3 4 5
    }
}
