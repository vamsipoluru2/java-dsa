package day12_oops.oop4.access;

public class A {
    private int num;
//    int num;//defult i wil be accessed in the package only
    protected int num1;
    String name;
    int[] arr;

    public int getNum(){//since this method is public it can be acessed from any where
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }






}
