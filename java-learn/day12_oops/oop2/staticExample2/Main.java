package day12_oops.oop2.staticExample2;

public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(22,"kunal",10000,false);
        Human rahul=new Human(24,"rahul",90000,false);
        Human arpit=new Human(26,"kunal",1000,false);

        //if obj is not createdd also it can work for staic access and modify
        System.out.println(Human.population);//3   use as Humman
        System.out.println(Human.population);//3
        System.out.println(Human.population);//3//while adding one human it will incrse by 1
        //don't use static variable by the obj name


        //caant use this in staic due to this is depeend on instance so it is non static
        //greeting();

        Main funn = new Main();
        funn.fun2();
    }

    //this is not depending on object due to static so greeting required itd own object
    static void fun(){

        //you cant access non static stuff without refferencing their instances in a
        //static context
        Main obj =new Main();//HERE referencing it
        obj.greeting();//the greeting is non staic so we are refering to obj

        //greeting();// you cant use this becaause it requiresa an instance
         //but the function you are using it  doesnot depend on instance
    }

    //fine due to it will be called via staic method in the end automatically in the main
    void fun2(){
        greeting();// while calling it requires obj but fun2 is there so it will uses fun2 obj
    }

    //something is not static belongs to an object
    void greeting(){
        fun();//static in side non static is possiable
        System.out.println("hello");
    }






}
