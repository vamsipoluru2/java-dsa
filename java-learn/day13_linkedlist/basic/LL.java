package day13_linkedlist.basic;

//import org.w3c.dom.Node;

public class LL {
    private Node head;//this are reference variable points to nodes
    private Node tail;
    private int size;



    public LL(){
        this.size=0;
    }

    //insert using recurssion tail and size is not given
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);

    }
    private Node insertRec(int val,int index,Node node){//node is at head
        if(index==0){
            Node temp=new Node(val,node);//adding new node and next is cuurent node at the index is zero
            size++;                      // constroctor in class NOde
            return temp;//node in new node help to point next node in linked list i.e node.next
        }
        //if not zero traverse
        node.next=insertRec(val,index-1,node.next);//at every func call it was returning it self// node.next help us to update value of current func
        //node.next =what was returning in previous one when its coming back from stack it was pointing to node returned previously
        return node;//after hitting base condition the sstack memory will printed one by ons tack has [3,5,9,7,1]1 is on top
    }



    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;//points to first value
        head=node;//change head to the new node updating the head
        if(tail==null){//if one item is there
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){//DUE TO TAIL TIME IS CONST
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    //reach behind the index value and add
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }if(index==size){
            insertLast(value);
            return;
        }
        if(index>size)throw new RuntimeException("out of bounnd");

        Node temp=head;//checking from head
        for(int i=1;i<index;i++){//go till privous node
            temp=temp.next;//by the end o loop temp = [40], and temp.next = [60] (since 40 was pointing to 60).
        }
        Node node=new Node(value,temp.next);//node.value = 50
                                            // node.next = temp.next (which was [60])
                                            //Now, [50] is pointing to [60].
        temp.next=node;//temp.next(which was [40].next)is updated to 50
        size++;//[40] → [50] instead of [40] → [60].

    }



    public Node findnode(int value){//find node that has that value
        Node node=head;
        while(node!=null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;

    }



    public int deleteFirst(){
        int val= head.value;// this is optional to jus print
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    // traversing til last
    public Node get(int index){

        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondlast=get(size-2);
        int val= tail.value;
        tail=secondlast;
        tail.next=null;

        return val;
    }



    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);//traverse till before node
        int val=prev.next.value;
        prev.next=prev.next.next;

        return val;
    }


    //head should not move directly thas why we take temp
    public void display(){//O(N)
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

//    LL class uses the Node class to build the linked list. Node is an inner, non-static class, which means:
//    It can access members of LL if needed
// this class is encapsulation
    private class Node{//node has value and next ll address
        private int value;
        private Node next;

        public Node(int value){// at starting node
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }

}
