package day12_oops.oop5.interfaces.extenddemo2;

public interface A {
    //static interface methods shuold all have a body
    //call via interface name
    static void greeting(){
        System.out.println("hey i am static method");
    }

   default void fun(){//jd 8
       System.out.println("i am in a");
   }
}
