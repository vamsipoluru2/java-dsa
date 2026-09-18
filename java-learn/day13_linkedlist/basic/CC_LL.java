package day13_linkedlist.basic;

public class CC_LL {

    private Node head;
    private Node tail;

    public CC_LL(){
        this.head=null;
        this.tail=null;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.val+"->");
                node=node.next;

            }while (node!=head);//not new node
        }
        System.out.println("HEAD");
    }


    public  void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.val==val){//is first node
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;//current node.next
            if(n.val==val){
                node.next=n.next;
                break;
            }
//            node=n;//other wise kepp moving  forwared
//                          {or}
            node=node.next;//other wise kepp moving  forwared
        }while (node!=head);


    }

    public class Node{

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
