package day12_oops.oop2.staticExample2;
//this is a demo to show initialisation of static function

public class StaticBlock {
    static int a=4;
    static int b;

//will only run once when the first obj is created  that is obj in main clss
// i.e when the class is loaded for the first timme
    static {
        System.out.println("Iam in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj2=new StaticBlock();//i f you called second time it did not run
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
