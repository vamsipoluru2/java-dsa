
import java.util.*;

class ListNode {
    public int data;
    public ListNode next;

    ListNode() {
        data = 0;
        next = null;
    }

    ListNode(int x) {
        data = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        data = x;
        this.next = next;
    }
}
public class _03SortLL012 {
    // 1. BRUTE FORCE - DATA REPLACEMENT

    public static ListNode sortListBrute(ListNode head) {
        // Step 1: Initialize counters
       int c0 = 0, c1 = 0, c2 = 0;
        ListNode temp = head;
        // Step 2: Count 0s, 1s and 2s
        while (temp != null) {
            if (temp.data == 0) {
                c0++;
            }
            else if (temp.data == 1) {
                c1++;
            }
            else if (temp.data == 2) {
                c2++;
            }
            temp = temp.next;
        }

        // Step 3: Reassign values
        temp = head;
        while (temp != null) {
            if (c0 > 0) {
                temp.data = 0;
                c0--;
            }
            else if (c1 > 0) {
                temp.data = 1;
                c1--;
            }
            else {
                temp.data = 2;
                c2--;
            }
            temp = temp.next;
        }
        return head;
    }



    // 2. OPTIMAL - LINK CHANGING    // 
    public static ListNode sortListOptimal(ListNode head) {
        // Step 1: Edge case
        if (head == null || head.next == null) {
            return head;
        }
        // Step 2: Create dummy nodes
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);
        // Step 3: Initialize pointers
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode temp = head;

        // Step 4: Distribute nodes into three lists
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            }
            else if (temp.data == 2) {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        // Step 5: Connect the three lists
        zero.next = (oneHead.next != null)? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        // Step 6: Return new head
        return zeroHead.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode createList() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(1);

        return head;
    }

    public static void main(String[] args) {
        // BRUTE FORCE
        ListNode head1 = createList();
        System.out.println("BRUTE FORCE - DATA REPLACEMENT");
        System.out.print("Original List: ");
        printList(head1);
        head1 = sortListBrute(head1);
        System.out.print("Sorted List:   ");
        printList(head1);
        System.out.println();


        // OPTIMAL
        ListNode head2 = createList();
        System.out.println("OPTIMAL - LINK CHANGING");
        System.out.print("Original List: ");
        printList(head2);
        head2 = sortListOptimal(head2);
        System.out.print("Sorted List:   ");
        printList(head2);
    }
}
