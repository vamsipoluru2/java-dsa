public class _01Add1ToLL {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Solution {

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

        public ListNode addOne(ListNode head) {

            head = reverseLL(head);

            ListNode temp = head;
            int carry = 1;

            while (temp != null) {

                temp.data = temp.data + carry;

                if (temp.data < 10) {
                    carry = 0;
                    break;
                } else {
                    temp.data = 0;
                    carry = 1;
                }

                temp = temp.next;
            }

            head = reverseLL(head);

            if (carry == 1) {
                ListNode newNode = new ListNode(1);
                newNode.next = head;
                head = newNode;
            }

            return head;
        }
    }

    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);

        Solution obj = new Solution();

        System.out.print("Original LL: ");
        printLL(head);

        head = obj.addOne(head);

        System.out.print("Updated LL: ");
        printLL(head);
    }
}