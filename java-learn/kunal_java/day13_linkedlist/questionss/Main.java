package day13_linkedlist.questionss;

public class Main {
    public static void main(String[] args) {

        LL list=new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(40);
        list.insertFirst(60);
        list.insertFirst(70);

        list.display();
        System.out.println("after duplicaate is removed");
        list.duplicate();
        list.display();

        System.out.println("rec insert");
        list.insertRec(47,2);
        list.display();


    }
}
