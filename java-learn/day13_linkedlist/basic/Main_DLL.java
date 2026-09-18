package day13_linkedlist.basic;

public class Main_DLL {
    public static void main(String[] args) {
        DOUBLE_LL list=new DOUBLE_LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(60);
        list.insertFirst(70);
        list.display();

        System.out.println();
        list.insertLast(9);
        list.display();
        list.insert(30,35);
        System.out.println();
        list.display();
    }
}
