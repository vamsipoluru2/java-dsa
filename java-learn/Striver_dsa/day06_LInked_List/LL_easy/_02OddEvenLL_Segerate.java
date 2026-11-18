
import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class _02OddEvenLL_Segerate {

    // =====================================
    // 1. BRUTE FORCE - DATA REPLACEMENT
    // =====================================

    public static ListNode oddEvenBrute(ListNode head) {

        // Step 1: Edge cases
        if (head == null || head.next == null) {
            return head;
        }

        // Step 2: Create ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        // Step 3: Store odd-position values
        while (temp != null && temp.next != null) {
            arr.add(temp.val);
            temp = temp.next.next;
        }

        if (temp != null) {
            arr.add(temp.val);
        }

        // Step 4: Store even-position values
        temp = head.next;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next.next;
        }

        // Step 5: Replace original node values
        temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }


    // =====================================
    // 2. OPTIMAL - LINK CHANGING
    // =====================================

    public static ListNode oddEvenOptimal(ListNode head) {

        // Step 1: Edge cases
        if (head == null || head.next == null) {
            return head;
        }

        // Step 2: Initialize pointers
        ListNode odd = head;
        ListNode even = head.next;

        // Save starting point of even list
        ListNode evenHead = head.next;

        // Step 3: Rearrange links
        while (even != null && even.next != null) {

            // Connect odd nodes
            odd.next = odd.next.next;
            even.next = even.next.next;

            // Move pointers
            odd = odd.next;
            even = even.next;
        }

        // Step 4: Connect odd and even lists
        odd.next = evenHead;

        return head;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    
    public static ListNode createList() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        return head;
    }


    // =====================================
    // 5. MAIN METHOD
    // =====================================

    public static void main(String[] args) {

        // BRUTE FORCE
        ListNode head1 = createList();

        System.out.println("Brute Force:");
        System.out.print("Original List: ");
        printList(head1);

        head1 = oddEvenBrute(head1);

        System.out.print("Result: ");
        printList(head1);


        System.out.println();


        // OPTIMAL
        ListNode head2 = createList();

        System.out.println("Optimal:");
        System.out.print("Original List: ");
        printList(head2);

        head2 = oddEvenOptimal(head2);

        System.out.print("Result: ");
        printList(head2);
    }
}
