package day12_oops.oop6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class  CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;//also working a index value

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFUll()){
            resize();
            return;
        }
        data[size++] =num;
    }
    private void resize(){
        int[] temp=new int[data.length*2];
        //copy the current items in the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFUll(){
        return size ==data.length;
    }

    public int remove(){//when you remove an item it will decrese size by 1 and when you add it will override
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public  void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
        CustomArrayList list=new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(8);
    for(int i=0;i<14;i++){
        list.add(i*2);
    }
        System.out.println(list);//actual size iss 20 and the values are 14


        ArrayList<Integer>list2 = new ArrayList<>();//this integer type arrraylist
        // this cant be primitives
//        list2.add("vamiss");
        list2.add(2);
//    public static c lass GenericInterface<T> {
//        void display(T value);
//    }
    }
}
