package day13_linkedlist.basic;

public class Main_CLL {
    public static void main(String[] args) {
        CC_LL list=new CC_LL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(60);
        list.insertLast(70);
        list.display();

        list.delete(40);

        list.display();

    }
}
