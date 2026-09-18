package day12_oops.oop3.polymorphism;

public class circle extends shapes {

    //this will run when obj of cirle is created
    //hence it is overriding the parent method
    @Override//annotaion for check
    void area(){//overriding child and parent has same function or method
        System.out.println("Area is pi*r*r");//only body is different
    }
}
