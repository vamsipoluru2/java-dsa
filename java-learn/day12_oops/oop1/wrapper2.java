package day12_oops.oop1;

public class wrapper2 {
    public static void main(String[] args) {

        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);// ti was not changing due to Integer is final class
//       System.out.println(a+" "+b);//it wont basic.swap due pass by reference not there in java

    }

    static void swap(int a,int b) {
        Integer temp=a;
        a=b;
        b=temp;


    }
}

