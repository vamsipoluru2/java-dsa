package day12_oops.oop5.abstractdemo;

public class daughter extends parent {
    public  daughter(int age){
        super(age);
    }
    @Override
    void career() {// in order to override they must  be abstract calss in parent
        System.out.println("i am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i love poots");
    }
}
