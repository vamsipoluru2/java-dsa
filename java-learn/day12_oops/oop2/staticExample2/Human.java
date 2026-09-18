package day12_oops.oop2.staticExample2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//obj independent

    static void message(){
//      System.out.println(this.age);// cnat use due to non static stuff it doesnot depend on human class
        System.out.println("hello baby");
    }


    public Human(int age,String name, int salary, boolean married) {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;//for static use class name


    }
}