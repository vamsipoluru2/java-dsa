package day12_oops.oop2.singleton3;

public class Main {
    public static void main(String[] args) {
        Singleton obj1= Singleton.getInstance();

        //it won't create new obj it will refer to same obj cretated one obj that is first obj reference
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
    //all 3 ref variables are pointing to jus one object
    }
}

