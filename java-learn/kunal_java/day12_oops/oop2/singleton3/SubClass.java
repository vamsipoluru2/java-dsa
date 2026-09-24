package day12_oops.oop2.singleton3;
//to know protected access modifier is accedd in diff package but subclass
import day12_oops.oop4.access.A;

public class SubClass extends A {
    public SubClass(int num1, String name){
        super(num1,name);

    }

    public static void main(String[] args) {
        SubClass obj=new SubClass(45,"vamsi");
        int n=obj.num1;//can be accesed in child class if protected
    }
}
//when subsub class extends subclass it cant know


class SubClass2 extends A {
    public SubClass2(int num1, String name){
        super(num1,name);
    }

    public static void main(String[] args) {
        SubClass2 obj=new SubClass2(45,"vamsi");
        int n=obj.num1;//can be accesed in child class if protected
    }
}
