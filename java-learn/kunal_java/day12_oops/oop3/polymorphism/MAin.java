package day12_oops.oop3.polymorphism;

public class MAin {
    public static void main(String[] args) {
        shapes shape=new shapes();
        circle circle=new circle();//if directily circle is created then it will go to circle class
        triangle triangle=new triangle();

//      method overriding
        shapes square=new square();//which particular method is called that is depend on object (method)
        //shapes will have access to square ,circles,triangle

        shapes circle2= new circle();//how it is identefing if parent calss is created then



        circle.area();
        triangle.area();
        square.area();

    }
}
