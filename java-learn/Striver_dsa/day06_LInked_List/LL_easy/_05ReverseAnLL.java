import java.util.Stack;

public class _05ReverseAnLL{

    // Linked List Node structure
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

        // APPROACH 1: Brute Force - Using Stack
        // Time: O(N), Space: O(N)
        public ListNode reverseListBrute(ListNode head) {

            Stack<Integer> stack = new Stack<>();
            ListNode temp = head;

            // First traversal: Store all values in the stack
            while (temp != null) {
                stack.push(temp.val);
                temp = temp.next;
            }
            // Reset temp to head for the second traversal
            temp = head;
            while (temp != null) {
                temp.val = stack.pop();
                temp = temp.next;
            }
            return head;
        }


        // APPROACH 2: Optimal - Reversing Links
        // Time: O(N), Space: O(1)
        public ListNode reverseListOptimal(ListNode head) {

            ListNode temp = head;
            ListNode prev = null;
            while (temp != null) {
                // 1. Store the next node before breaking the link
                ListNode run = temp.next;
                // 2. Reverse the current node's link
                temp.next = prev;
                // 3. Move previous to the current node
                prev = temp;
                // 4. Move temp to the next node
                temp = run;
            }
            // Previous becomes the new head
            return prev;
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

        _05ReverseAnLL obj = new _05ReverseAnLL();

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

        System.out.println("Original Linked List:");
        printList(head1);

        // Execute brute force approach
        head1 = obj.reverseListBrute(head1);

        System.out.println("Brute Force Approach:");
        printList(head1);

        // Execute optimal approach
        head2 = obj.reverseListOptimal(head2);

        System.out.println("Optimal Approach:");
        printList(head2);
    }
}