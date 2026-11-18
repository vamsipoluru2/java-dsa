public class _04DoublyLL {

    static class ListNode {
        int data;
        ListNode next;
        ListNode back; // For doubly linked list

        // Constructor
        ListNode(int val) {
            data = val;
            next = null;
            back = null;
        }
    }

    public static ListNode arraytoDoublyLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            current.next = newNode;
            newNode.back = current; // Set the previous pointer
            current = newNode;
        }
        return head;
    }

    //delete head
    public static ListNode deleteHead(ListNode head) {
        if (head == null || head.next == null) {//edge case empty and single node
            return null;
        }
        ListNode prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    //delete tail
    public static ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        ListNode previous = tail.back;
        previous.next = null;
        tail.back = null;
        return head;
    }

    //delete kth element
    public static ListNode deleteKthEle(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        // k is greater than length of linked list
        if (temp == null) {
            return head;
        }
        ListNode prev = temp.back;
        ListNode front = temp.next;
        if (prev == null && front == null) {
            return null; // Only one node in the list
        }
        else if (prev == null) {
            return deleteHead(head);
        }
        else if (front == null) {
            return deleteTail(head);
        }
        else {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }

    // INSERT AT HEAD
    public static ListNode insertBeforeHead(ListNode head, int ele) {
        ListNode newNode = new ListNode(ele);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head.back = newNode;
        return newNode;
    }

    // INSERT AT TAIl

    public static ListNode insertBeforeTail(ListNode head, int ele) {
        if (head == null) {
            return insertBeforeHead(head, ele);
        }
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        ListNode prev = tail.back;
        ListNode newNode = new ListNode(ele);
        prev.next = newNode;
        newNode.back = prev;

        newNode.next = tail;
        tail.back = newNode;
        return head;
    }
    //insert before kth element
     public static ListNode insertBeforeKthEle(ListNode head,int k,int ele) {
        if (k == 1) {
            return insertBeforeHead(head, ele);
        }
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        ListNode prev = temp.back;
        ListNode newNode = new ListNode(ele);
        if (prev == null) {
            newNode.next = head;
            head.back = newNode;
            return newNode; // New node becomes the new head
        }
    else{
        prev.next = newNode;
        newNode.back = prev;

        newNode.next = temp;
        temp.back = newNode;
        return head;
    }}

    //insert before given node with value ele

    public static ListNode insertbeforeGivenEle(ListNode head, int target, int ele) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while (temp != null) {// Traverse the list to find the target node
            if (temp.data == target) {break;}
            temp = temp.next;
        }

        if (temp == null) {
            return head; // Target not found
        }

        ListNode prev = temp.back;
        ListNode newNode = new ListNode(ele);

        if (prev == null) { // Inserting before head
            newNode.next = head;
            head.back = newNode;
            return newNode; // New node becomes the new head
        } else {
            prev.next = newNode;
            newNode.back = prev;

            newNode.next = temp;
            temp.back = newNode;
            return head;
        }
    }


    //revere a Dll
    public static ListNode reverseDLL(ListNode head) {

    if (head == null || head.next == null) {
        return head;
    }

    ListNode current = head;
    ListNode last = null;

    while (current != null) {
        // swap next and back
        last = current.back;
        current.back = current.next;
        current.next = last;

        // move to next node
        current = current.back;
    }
    // last points to old previous node
    // last.back is the new head
    return last.back;
}



    public static void printDoublyLinkedList(ListNode head) {
        ListNode temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 8};

        // Convert array to doubly linked list
        ListNode head = arraytoDoublyLL(arr);
        System.out.println("Original Doubly Linked List:");
        printDoublyLinkedList(head);

        // Delete head
        head = deleteHead(head);
        System.out.println("After deleting head:");
        printDoublyLinkedList(head);

        // Delete tail
        head = deleteTail(head);
        System.out.println("After deleting tail:");
        printDoublyLinkedList(head);

        // Delete kth element
        int k = 2;
        head = deleteKthEle(head, k);
        System.out.println("After deleting " + k + "th element:");
        printDoublyLinkedList(head);

        // Insert before head 
        int newHeadValue = 1;
        head = insertBeforeHead(head, newHeadValue);
        System.out.println("After inserting " + newHeadValue + " before head:");
        printDoublyLinkedList(head);

        // Insert before tail
        int newTailValue = 9;
        head = insertBeforeTail(head, newTailValue);
        System.out.println("After inserting " + newTailValue + " before tail:");
        printDoublyLinkedList(head);

        // Insert before kth element
        int newKthValue = 7;
        k = 2;
        head = insertBeforeKthEle(head, k, newKthValue);
        System.out.println("After inserting " + newKthValue + " before " + k + "th element:");
        printDoublyLinkedList(head);

        // Insert before given element
        int targetValue = 5;
        int newValue = 4;
        head = insertbeforeGivenEle(head, targetValue, newValue);
        System.out.println("After inserting " + newValue + " before " + targetValue + ":");
        printDoublyLinkedList(head);

        // Reverse the doubly linked list
        head = reverseDLL(head);
        System.out.println("After reversing the doubly linked list:");
        printDoublyLinkedList(head);
    }
}