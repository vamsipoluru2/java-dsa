import java.util.*;

class ListNode {
    int data;
    ListNode next;

    // Constructor
    ListNode(int val) {
        data = val;
        next = null;
    }
}

public class _03LinkedList {
     // Convert array to linked list
    public static ListNode arrayToLinkedList(int[] arr) {
        int size = arr.length;
        if (size == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < size; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Delete head
    public static ListNode deleteHead(ListNode head) {
        // empty linked list
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    //delete tail
    public static ListNode deleteTail(ListNode head){
        if(head==null||head.next==null){
            return null;
        }
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static ListNode deleteKthEle(ListNode head,int k){
        if(head==null) return head;
        if(k==1)return deleteHead(head);
        int cnt=0;
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
        cnt++;
        if(cnt==k){
            prev.next=prev.next.next;
            break;
        }
        prev = temp;
        temp=temp.next;    
    }
    return head;
    }

    public static ListNode deleteEle(ListNode head,int ele){
        if(head==null) return head;
        if(head.data==ele)return deleteHead(head);
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
        if(temp.data==ele){
            prev.next=prev.next.next;
            break;
        }
        prev = temp;
        temp=temp.next;    
    }
    return head;
    }

    // Insert at head
    public static ListNode insertHead(ListNode head,int ele){
        ListNode temp=new ListNode(ele);
        temp.next = head;
        return temp;
    }

    //Insert at tail
    public static ListNode insertTail(ListNode head,int ele){
        if(head==null)return new ListNode(ele);
        ListNode temp=head;//create a copy of head
        while(temp.next!=null){//traverse to the end of the linked list
            temp=temp.next;
        }
        temp.next=new ListNode(ele);//insert new node at the end
        return head;
    }

    //insert at Kth position
public static ListNode insertKthEle(ListNode head,int k,int ele){
    if(head==null) {//if ll is empty and k==1 then insert at head
        if(k==1)return new ListNode(ele);
     }
     //if k==1 then insert at head
    if(k==1)return insertHead(head,ele);
        
    int cnt=0;
        ListNode temp=head;

        while(temp!=null){
        cnt++;
        if(cnt==k-1){//bringing the pointer to the (k-1)th node
           ListNode x =new ListNode(ele);
            x.next=temp.next;
            temp.next=x;
            break;
        }
        temp=temp.next;    
    }
    return head;
}

  //insert at before value
public static ListNode insertbeforevalue(ListNode head,int val,int ele){
    if(head==null) {
        return null;
     }
     
     if(head.data==val)return insertHead(head,ele);
    
        ListNode temp=head;

        while(temp.next!=null){
        if(temp.next.data==val){//bringing the pointer to the (k-1)th node
           ListNode x =new ListNode(ele);
            x.next=temp.next;
            temp.next=x;
            break;
        }
        temp=temp.next;    
    }
    return head;
}

//length of ll
    public static int lengthOfLL(ListNode head){
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

    // Print linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //search in ll
    public static boolean searchInLL(ListNode head,int ele){
        ListNode temp=head;
        while(temp!=null){
            if(temp.data==ele)return true;
            temp=temp.next;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to linked list
        ListNode head = arrayToLinkedList(arr);
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Delete head
        head = deleteHead(head);
        System.out.println("After deleting head:");
        printLinkedList(head);

        //delete head
        head=deleteTail(head);
        System.out.println("After deleting Tail:");
        printLinkedList(head);

        //delete Kth ele
        int k = 3;
        head = deleteKthEle(head, k);
        System.out.println("After deleting " + k + "th element:");
        printLinkedList(head);

        //delete ele
        int ele = 3;
        head = deleteEle(head, ele);
        System.out.println("After deleting element " + ele + ":");
        printLinkedList(head);

        // Insert at head
        head = insertHead(head, 10);
        System.out.println("After inserting " + " at head:");  
        printLinkedList(head);

        //insert at tail
        head = insertTail(head, 20);
        System.out.println("After inserting " + " at tail:");
        printLinkedList(head);

        //insert at Kth position
        k = 2;
        head = insertKthEle(head, k, 15);
        System.out.println("After inserting " + " at " + k + "th position:");
        printLinkedList(head);

        //insert before value
        int val = 10;
        head = insertbeforevalue(head, val, 25);
        System.out.println("After inserting " + " before value " + val + ":");
        printLinkedList(head);

        //length of ll
        int length = lengthOfLL(head);
        System.out.println("Length of linked list: " + length);
        //search in ll
        int searchEle = 15;
        boolean found = searchInLL(head, searchEle);
        if (found) {
            System.out.println("Element " + searchEle + " found in the linked list.");
        } else {
            System.out.println("Element " + searchEle + " not found in the linked list.");
        }
        
    }

}