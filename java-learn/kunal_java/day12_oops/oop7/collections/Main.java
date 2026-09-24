package day12_oops.oop7.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Collection
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();

       list.add(34);
        list.add(45);
        list.add(75);
        list.add(100);
        System.out.println((list));


        //vector is not fast cant acces all at a time wait till one by one
        List<Integer> vector=new Vector<>();
        vector.add(4);
        vector.add(5);
        vector.add(5);
        vector.add(10);

        System.out.println((vector));




    }
}
