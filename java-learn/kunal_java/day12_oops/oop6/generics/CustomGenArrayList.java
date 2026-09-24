package day12_oops.oop6.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {//T makes custom data type is used

    private Object[] data;//object type due to it was inherited by all the other classes
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenArrayList(){
        data=new Object[DEFAULT_SIZE];//it will generate on run time
    }

    public void add(T num){
        if(isFUll()){
            resize();
            return;
        }
        data[size++] =num;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        //copy the current items in the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFUll(){
        return size ==data.length;
    }

    public T remove(){//when you remove an item it will decrese size by 1
        T removed=((T)data[--size]);//casting
        return removed;
    }

    public  T get(int index){
        return((T)data[index]);
    }

    public int size(){
        return size;
    }

    public  void set(int index, T value){
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
//

        //CUSTOM TEMPLETE
        CustomGenArrayList<Integer> list3=new CustomGenArrayList();
        for(int i=0;i<14;i++){
        list3.add(2*i);
    }
        System.out.println(list3);
    }
}
