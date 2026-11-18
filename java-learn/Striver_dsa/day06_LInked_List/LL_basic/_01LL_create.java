//creating Node

    class Node {
    public int data;
    public Node next;
 
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }

}


public class _01LL_create {
    public static void main(String[] args) {
        int[] arr={2,5,6,8};
        Node y=new Node(arr[3]);
        System.out.println(y.data);
    }

 

}
