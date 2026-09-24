package day12_oops.oop5.abstractdemo;

//everey thing can do with this class as normal
public abstract class parent {

    int age;
    public parent(int age){
        this.age=age;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal(){ //return type required
        System.out.println("this is a normal method");
    }

    //cant create abstract static constructors in this bcs static constructors cant be overriden
    //cant create abstract constructors in this
    // Constructors must have a body Abstract methods do not have a body.


    //    abstract  parent();//cant create abstract class constructor/
    abstract void career(); // they dont have body due the ment for overriden by child class
    abstract void partner();
}
