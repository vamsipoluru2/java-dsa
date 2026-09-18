package day13_linkedlist.basic;

public class DOUBLE_LL {

    private  Node head;
//    Why no constructor needed now?	head defaults to null automatically
//    When should I write a constructor?	If you're initializing more fields (like tail, size) or customizing

//    public void display(){
//        Node node=head;
//        while(node!=null){
//            System.out.print(node.value+"->");
//            node=node.next;
//        }
//        System.out.println("END");
//    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+" -> ");
            last=node;// it was above bcs it shold not become null from tail side keep updating
            node=node.next;
        }

        System.out.println("END");
        //after while loop the last is at tail node
        System.out.println("print in reverse");
        while (last!=null){//when it is coming in rev it will reach head after that null
            System.out.print(last.value+" -> ");
            last=last.prev;
        }
        System.out.print("start");
    }

    public void insertFirst(int value){
        Node node =new Node(value);
        node.next=head;// node.next = head; → node.next = null;
        node.prev=null;
        if(head!=null) {// nul pointer exception inserting at first time
            head.prev = node;
        }
        head=node;
    }

    public void insertLast(int val){
        Node node=new Node(val);//creating node
        Node last=head;//last is temp variable and going to last if tail is not provided
//        if ll is empty
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        node.next=null;
        last.next=node;
        node.prev=last;
    }


    public void insert(int after,int value){
        Node P=find(after);//P is the Node of a given value it is travsed till the value after yoou have to insert
        if (P==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(value);
        node.next=P.next;
        P.next=node;
        node.prev=P;
        if(node.next!=null){
        node.next.prev=node;
        }
    }

    public Node find(int value){//find node that has that value
            Node node=head;
        while(node!=null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            // Only one node
            head = null;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Remove last node
        last.prev.next = null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next; // move head to the next node
        if (head != null) {
            head.prev = null; // set new head's prev to null
        }
    }



    private class Node{//node has value and next ll address
         int value;
         Node next;
         Node prev;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

}
