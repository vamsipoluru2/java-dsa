package day13_linkedlist.basic;

public class Main {
    public static void main(String[] args) {

        LL list=new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(60);
        list.insertFirst(70);
        list.insertLast(0);
        list.insert(50,4);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

        System.out.println("rec insert");
        list.insertRec(49,2);
        list.display();

//        LL.Node foundNode = list.findnode(50);
//        if (foundNode != null) {
//            System.out.println(foundNode.value);
//        } else {
//            System.out.println("Not found");
//        }
//



    }
}
