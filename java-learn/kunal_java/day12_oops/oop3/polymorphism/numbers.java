package day12_oops.oop3.polymorphism;

public class numbers {

    double sum(double a,int b) {
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        //method overloading
        numbers obj=new numbers();
        obj.sum(2.5,3);//it automatic converes into int
        obj.sum(1,2,7);
//        obj.sum(1,2,7,4);at complie time it get to know there is no 4 argumnets in numbers
    }
}
