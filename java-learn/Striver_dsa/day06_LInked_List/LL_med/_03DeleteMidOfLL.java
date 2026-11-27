public class _03DeleteMidOfLL {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Solution {

        // Brute Force Approach
        public ListNode deleteMiddleBrute(ListNode head) {

            // Handle empty and single-node linked lists
            if (head == null || head.next == null)
                return null;

            // Find the length of the linked list
            ListNode temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            // Calculate the middle position
            int mid = (count / 2) + 1;

            // Traverse to the node before the middle
            temp = head;

            while (temp != null) {
                mid--;

                if (mid == 1) {

                    // Delete the middle node
                    temp.next = temp.next.next;
                    break;
                }

                temp = temp.next;
            }

            return head;
        }

        // Optimal Approach - Slow and Fast Pointers
        public ListNode deleteMiddleOptimal(ListNode head) {

            // Handle empty and single-node linked lists
            if (head == null || head.next == null)
                return null;

            // Initialize slow and fast pointers
            ListNode slow = head;
            ListNode fast = head.next.next;

            // Move slow to the node before the middle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Delete the middle node
            slow.next = slow.next.next;

            return head;
        }
    }

    // Print the linked list
    public static void printLL(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Create linked list for brute force
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

        Solution obj = new Solution();

        System.out.print("Original LL: ");
        printLL(head1);

        System.out.print("Brute Force: ");
        printLL(obj.deleteMiddleBrute(head1));

        System.out.print("Optimal: ");
        printLL(obj.deleteMiddleOptimal(head2));
    }
}