package day13_linkedlist.questionss;

import day13_linkedlist.basic.CC_LL;

public class MergeSort {
//    public ListNode sortList(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode mid=getMid(head);
//        ListNode left=sortList(head);
//        ListNode right=sortList(mid);
//
//        return mergeTwoLists(left,right);
//    }
//
//
//    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummyHead=new ListNode();
//        ListNode tail=dummyHead;
//
//        while(list1 !=null && list2 !=null){
//            if(list1.val<list2 .val){
//                tail.next=list1;
//                list1=list1.next;
//                tail=tail.next;
//            }else{
//                tail.next=list2;
//                list2=list2.next;
//                tail=tail.next;
//            }
//        }
//        tail.next=(list1 != null)?list1:list2;
//        return dummyHead.next;
//    }
//
//    ListNode middleNode(cycle_ques.ListNode head) {
//        if (head == null) {  // Handle the null head case FIRST
//            return null;
//        }
//        ListNode fast=head;
//        ListNode slow=head;
//        while(fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//
//        }
//        return slow;
//    }
//    public class Node{
//
//        int val;
//        CC_LL.Node next;
//
//        public Node() {
//        }
//
//        public Node(int val) {
//            this.val = val;
//        }
//    }
}
