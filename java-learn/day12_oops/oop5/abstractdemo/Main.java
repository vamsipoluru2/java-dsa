package day12_oops.oop5.abstractdemo;

public class Main {
    public static void main(String[] args) {
        son son=new son(30);
        son.career();


        parent daughter=new daughter(35);//This is a classic example of runtime polymorphism in Java.
//        Yes, exactly! You're right on track.  The reason you can call daughter.career() even when using a parent reference:
//        is because of this line in the abstract class:
        daughter.career();

        parent.hello();//static from abstract class can be called
        son.normal();
//        parent mom=new parent() ;//it was not creating abctract class obj
        //it was saying to override
    }
}
