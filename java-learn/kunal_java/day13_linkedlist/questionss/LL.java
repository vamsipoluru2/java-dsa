package day13_linkedlist.questionss;


public class LL {

    private LL.Node head;
    private LL.Node tail;
    private int size;


    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        LL.Node node=new Node(val);
        node.next=head;//points to first value
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){//DUE TO TAIL TIME IS CONST
            insertFirst(val);
            return;
        }
        LL.Node node=new LL.Node(val);
        tail.next=node;
        tail=node;
        size++;
    }


    //insert using recurssion tail and size is not given
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);

    }
    private LL.Node insertRec(int val, int index, Node node){//node is at head
        if(index==0){
            LL.Node temp=new Node(val,node);//adding new node and next is cuurent node at the index is zero
            size++;                      // constroctor in class NOde
            return temp;//node in new node help to point next node in linked list i.e node.next
        }
        //if not zero traverse
        node.next=insertRec(val,index-1,node.next);//at every func call it was returning it self// node.next help us to update value of current func
        //node.next =what was returning in previous one when its coming back from stack it was pointing to node returned previously
        return node;//after hitting base condition the sstack memory will printed one by ons tack has [3,5,9,7,1]1 is on top
    }

    public void display(){//O(N)
        LL.Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }



    private class Node{//node has value and next ll address
        private int value;
        private LL.Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, LL.Node next){
            this.value=value;
            this.next=next;
        }

    }

    public Node get(int index){

        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    //questions
    public void duplicate(){
        Node node=head;

        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;// this will upadte temp node from head
            }

        }
        tail=node;
        tail.next=null;
    }
//duplicate
    //public static void main(String[] args) {
    //        LL list=new LL();
    //        list.insertFirst(1);
    //        list.insertFirst(1);
    //        list.insertFirst(1);
    //        list.insertFirst(2);
    //        list.insertFirst(4);
    //        list.insertFirst(4);
    //
    //        list.display();
    //        list.duplicate();
    //        list.display();
    //
    //    }

//reverse a LL recursion
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);//reching till last
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    //in place reversal
    public void reverse(){
        if(size<2){
            return;
        }
//        if (head == null || head.next == null) { // Handle empty or single-node list
//            return head;
//        }

        Node prev=null;
        Node present=head;
        Node Next=present.next;//present is updated so present.next

                while(present!=null){
                    present.next=prev;
                    prev=present;
                    present=Next;
                    if(Next!=null){
                        Next=Next.next;
                    }
                }
                head=prev;
    }



//bubble sort
    public void bubblesort(){
        bubblesort(size-1,0);

    }
    private void bubblesort(int row,int col){
        if(row==0){
            return;
        }

        if(col<row){
            Node first=get(col);
            Node second=get(col+1);

            if(first.value>second.value){
                if(first==head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second==tail){
                    Node prev=get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }else{
                    Node prev=get(col-1);
                    prev.next =second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubblesort(row,col+1);
        }else{
            bubblesort(row-1,0);
        }
    }
// merge
    public static LL merge(LL first, LL second){
        Node f=first.head;
        Node s=second.head;

        LL ans=new LL();

        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }

        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }



    public static void main(String[] args) {
        LL first=new LL();
        LL second=new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        second.insertLast(17);

        LL ans =LL.merge(first,second);
        System.out.println("merge");

        ans.display();

        LL list=new LL();
        for(int i=8;i>0;i--){
            list.insertLast(i);
    }
//        System.out.println("bubble sort");
//        list.display();
//        list.bubblesort();
//        list.display();

        System.out.println("recur rverese LL");
        list.display();
        list.reverse(list.head);
        list.display();
    }

}
