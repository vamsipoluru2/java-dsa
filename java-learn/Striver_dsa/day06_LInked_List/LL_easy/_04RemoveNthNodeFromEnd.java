public class _04RemoveNthNodeFromEnd {

    // Linked List Node structure
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // APPROACH 1: Brute Force - Using Length
    // Time: O(L), Space: O(1) | Two passes
    public ListNode removeNthFromEndBrute(ListNode head, int n) {

        ListNode temp = head;
        int Cnt = 0;

        // Calculate the length of the linked list
        while (temp != null) {
            Cnt++;
            temp = temp.next;
        }

        // Edge case: Deleting the head node
        if (Cnt == n) {
            return head.next;
        }

        // Find the position of the node before the target
        int Result = Cnt - n;
        temp = head;

        // Traverse to the previous node
        while(temp!=null){
            Result--;
            if (Result == 0) {break;}
            temp = temp.next;
        }
        // Delete the target node
        temp.next = temp.next.next;
        return head;
    }


    // APPROACH 2: Optimal - Fast and Slow Pointers
    // Time: O(L), Space: O(1) | Single pass
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        // Create a gap of n steps between fast and slow bcs fist fast will reach the end of the list n steps before slow
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // Edge case: Deleting the head node
        if (fast == null) {
            return head.next;
        }

        // Move both pointers while maintaining the gap
        // Stop when fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    // Method to print the linked list
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // Main method
    public static void main(String[] args) {

        _04RemoveNthNodeFromEnd obj = new _04RemoveNthNodeFromEnd();

        // Create linked list for brute force approach
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        // Create linked list for optimal approach
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        int n = 3;

        System.out.println("Original Linked List:");
        printList(head1);

        // Execute brute force approach
        head1 = obj.removeNthFromEndBrute(head1, n);
        System.out.println("Brute Force Approach:");
        printList(head1);

        // Execute optimal approach
        head2 = obj.removeNthFromEnd(head2, n);
        System.out.println("Optimal Approach:");
        printList(head2);
    }
}