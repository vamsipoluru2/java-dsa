package day12_oops.oop4.access;

public class SubClass extends A {
    public SubClass (int num1,String name){
        super(num1,name);

    }

    // Instance : specific object created from a class using the new key word it is real obj built using the blue print
    public static void main(String[] args) {
        SubClass obj=new SubClass(45,"vamsi");
        int n=obj.num1;//can be accessed in child class if protected
        System.out.println(obj instanceof  A);//it is instance of subclass
        System.out.println(obj instanceof  Object);//it is instance of object class

        //every class i instance of object class
    }
}
