package day13_linkedlist.questionss;

import java.util.List;

public class cycle_ques {
    //https://leetcode.com/problems/linked-list-cycle/
        public boolean hasCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;

        }

    //https://leetcode.com/problems/linked-list-cycle-ii/
// length and detect cycle is in one ques len cyc is using by detect cyc
    public int lengthCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //cal length
                ListNode temp=slow;
                int length=0;
                //running atleast once
                do{// it helps to move slow point ahead
                    temp=temp.next;
                    length++;
                }
                while (temp!=slow);//slow and fast is one point the temp which is pointing to slow
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCyclenode(ListNode head) {
            int length=0;

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
               length=lengthCycle(slow);
               break;
            }
        }
        if(length==0){
            return null;
        }

        //find start node
        ListNode f=head;
        ListNode s=head;
        while(length>0){
            s=s.next;
            length--;
    }
        //keep moving bith forward and they will meet at cycle start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }



//    private void reverse(ListNode node){
//            if(node==tail){
//                head=tail;
//                return;
//            }
//            reverse(node.next);
//            tail.next=node;
//            tail=node;
//            tail.next=null;
//    }


//    https://leetcode.com/problems/palindrome-linked-list/submissions/1549891755/
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) { // Handle empty or single-node list
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }



    //reverse sub list as per index given
    //https://leetcode.com/problems/reverse-linked-list-ii/description/
    public ListNode reverseBetween(ListNode head, int left, int right) {
            if(left==right){
                return head;
            }
            //skip the first left-1 nodes
            ListNode current=head;
            ListNode prev=null;
            for(int i=0;current!=null&& i<left-1;i++){
                prev=current;
                current=current.next;
            }

            ListNode last=prev;
            ListNode NewEnd=current;

            ListNode next=current.next;
            for(int i=0;current!=null&&i<right-left+1;i++){
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next=next.next;
                }
            }if(last!=null){
                last.next=prev;

        }else{
               head =prev;
        }
            NewEnd.next=current;
            return head;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {  // Handle the null head case FIRST
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }


    public boolean isPalindrome(ListNode head) {
            //apparently the original LL is spilitted and checked and re joinned at last
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);// when you reverse head is no longer point s to it original
        ListNode rereverseHead=headSecond;
        //cmp both th halves
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(rereverseHead);
        return head==null||headSecond==null;
    }

    //https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode mid=middleNode(head);

        ListNode hs=reverseList(mid);
        ListNode hf=head;
        //rearrange
        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            //
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }//after completion off setting
        //next tail to null
        if(hf!=null){
            hf.next=null;
        }

    }

    //https://leetcode.com/problems/reverse-nodes-in-k-group/
    //google facebook amazon
    //its also reversing the <k end items dont modify k no of nodes to reverse
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        //skip the first left-1 nodes
        ListNode current=head;
        ListNode prev=null;

        while (true){

        ListNode last=prev;
        ListNode NewEnd=current;// new end of reversed list helps to connect

        ListNode next=current.next;
//        running for loop  k timmes till current is not equal to null
        for(int i=0;current!=null&&i<k;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }if(last!=null){
            last.next=prev;

        }else{
            head =prev;
        }
        NewEnd.next=current;
            if(current==null){
                break;
            }
            prev=NewEnd;//new end is the perev of last one
        }
        return head;

    }

    //reverse alternate k grp
    public ListNode reversealternateKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        //skip the first left-1 nodes
        ListNode current=head;
        ListNode prev=null;

        while (current!=null){

            ListNode last=prev;
            ListNode NewEnd=current;

            ListNode next=current.next;
            for(int i=0;current!=null&&i<k;i++){
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next=next.next;
                }
            }if(last!=null){
                last.next=prev;

            }else{
                head =prev;
            }
            NewEnd.next=current;
            // after pointing skip k nodes and again reverse
            //skip k nodes
            for(int i=0;current!=null&i<k;i++){
                prev=current;
                current=current.next;
            }
        }
        return head;

    }

    //https://leetcode.com/problems/rotate-list/
    //so here we are taking last node from ll and conncting to head and checking for new end and connecting newend.Next to front and breaking
    // i.e making newend.next to null here the intermediate points between rotated one will follows
    //here we are making circular and breaking at a point the point k ends from start
        public ListNode rotateRight(ListNode head, int k) {
            if(k<0||head==null||head.next==null){
                return head;
            }
            ListNode last=head;
            int length=1;
            while (last.next!=null){//after loop completion it will be at last
                last=last.next;
                length++;
            }
            last.next=head;//last node is connected to head
            //rotaitons
            int rotations=k%length;// to make sure  ( remove the length times ) if length is 6 and k= 6 no chaange if length is 6 k=7 then one rotaiton
            int skip=length-rotations;

            ListNode newLast=head;
            //finding new tail
            for(int i=0;i<skip-1;i++){
                newLast=newLast.next;
            }// after skinping then make pointing
            head=newLast.next;
            newLast.next=null;

            return head;
        }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

//main for lengthof cycle
    public static void main(String[] args) {
        cycle_ques cq = new cycle_ques();

        // Example 1: Cycle exists
        ListNode head1 = cq.new ListNode(1);
        ListNode node2 = cq.new ListNode(2);
        ListNode node3 = cq.new ListNode(3);
        ListNode node4 = cq.new ListNode(4);
        ListNode node5 = cq.new ListNode(4);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2; // Cycle created

        int length1 = cq.lengthCycle(head1);
        System.out.println("Cycle length " + length1);

    }
}

