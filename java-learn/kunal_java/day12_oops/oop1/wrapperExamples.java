package day12_oops.oop1;

//In Java, wrapper classes are used to convert primitive data types into objects.
public class wrapperExamples {
    public static void main(String[] args) {
        Integer num = 45;
//      num.//this gives more function


        // final int bonus=2;
        // bonus=3;//cant modifi due to it is final class

        //final variables always too be initlized cant change the value only for primitive datatypes
        final A kunal = new A("kual kuash");//A custom data type it is non primitive
        kunal.name = "other name";

        //when non -primitve is final you cannot re assign it
        // but you can assign it to a class that is final class and vice
        // kunal=new A("new name");//cant


//important for gabage collector
         A obj;
         for(int i = 0; i <1000000000;i++){//somany obj is being created
             obj=new A("kunal");//no more than 1 obj points to same ref variable
         }
    }

}

class A{
        final int num=10;
        String name;

    public A(String name){
//        System.out.println("obj created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable{// finilaize when garbage collection hits
        System.out.println("OBJECT IS DESTROYED");
    }

}


