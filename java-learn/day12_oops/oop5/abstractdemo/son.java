package day12_oops.oop5.abstractdemo;

public class son extends parent {
    public  son(int age){
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("i am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("i love iron man ");
    }
}
