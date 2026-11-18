public class _05reverseDLL {
    //reverse doubly linked list in one pass
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
}
