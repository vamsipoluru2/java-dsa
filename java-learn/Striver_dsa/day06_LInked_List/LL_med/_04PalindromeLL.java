import java.util.Stack;

public class _04PalindromeLL {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Solution {

        // Brute Force Approach - Using Stack
        public boolean isPalindromeBrute(ListNode head) {

            Stack<Integer> stack = new Stack<>();
            ListNode temp = head;

            // Store all node values in the stack
            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }

            // Reset temp to head
            temp = head;

            // Compare linked list values with stack values
            while (temp != null) {
                if (temp.data != stack.pop())
                    return false;

                temp = temp.next;
            }

            return true;
        }

        // Reverse the linked list
        public ListNode reverseLL(ListNode head) {

            ListNode temp = head;
            ListNode prev = null;

            while (temp != null) {
                ListNode run = temp.next;
                temp.next = prev;
                prev = temp;
                temp = run;
            }

            return prev;
        }

        // Optimal Approach - Slow and Fast Pointers
        public boolean isPalindromeOptimal(ListNode head) {

            // Handle empty and single-node linked lists
            if (head == null || head.next == null)
                return true;

            ListNode slow = head;
            ListNode fast = head;

            // Find the end of the first half
            while (fast.next != null && 
                   fast.next.next != null) {

                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse the second half
            ListNode newHead = reverseLL(slow.next);

            // Initialize pointers for comparison
            ListNode first = head;
            ListNode second = newHead;

            // Compare both halves
            while (second != null) {
                if (first.data != second.data) {
                    // Restore the original linked list
                    slow.next = reverseLL(newHead);
                    return false;
                }
                first = first.next;
                second = second.next;
            }
            // Restore the original linked list
            slow.next = reverseLL(newHead);
            return true;
        }
    }

    public static void main(String[] args) {

        // Create the linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Solution obj = new Solution();

        System.out.println("Brute: " 
                + obj.isPalindromeBrute(head));

        System.out.println("Optimal: " 
                + obj.isPalindromeOptimal(head));
    }
}