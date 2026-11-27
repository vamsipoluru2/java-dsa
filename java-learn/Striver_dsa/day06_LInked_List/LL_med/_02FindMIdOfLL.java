public class _02FindMIdOfLL {

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
        public ListNode middleBrute(ListNode head) {


        // Handle empty and single-node linked lists
         if (head == null || head.next == null)
              return head;

            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            int mid = (count / 2) + 1;

            temp = head;
            while (temp != null) {
                mid--;
                if (mid == 0)
                    break;
                temp = temp.next;
            }
            return temp;
        }

        // Optimal Approach
        public ListNode middleOptimal(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution obj = new Solution();

        System.out.println("Brute: " + obj.middleBrute(head).data);
        System.out.println("Optimal: " + obj.middleOptimal(head).data);
    }
}