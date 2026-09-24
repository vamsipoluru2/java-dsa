package day12_oops.oop2.singleton3;

public class Singleton {
    //it can create only one object not allow to call constructor
    private Singleton(){//only used in this class

    }
    private static Singleton instance;

    //check wheater 1 obj is created or not
    public static Singleton getInstance(){
        if(instance == null){
            instance=new Singleton();// the constructer(SIngleton()) can be called
        }
        return instance;
    }
}
