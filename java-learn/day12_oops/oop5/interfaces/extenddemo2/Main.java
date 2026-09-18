package day12_oops.oop5.interfaces.extenddemo2;

public class Main implements A,B {
// the will will help to not to override ex in A fun( );

    @Override
    public void greet() {

    }



    public static void main(String[] args) {
        Main obj=new Main();
        A.greeting();
//        A.fun();
    }

    @Override
    public void fun() {
        A.super.fun();
    }
}
