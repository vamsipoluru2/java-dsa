package day12_oops.oop1;

import java.util.Arrays;

public class  advclasses {
    public static void main(String[] args) {
        Student kunal =new Student(15,"kunal",96.5f);
        kunal.greeting();//hello my name is kunal
//      kunal.changeName("head ");

        System.out.println(kunal.rollno);//15 initiled so value is printed
        System.out.println(kunal.name);//kunal if change name func is active then head
        System.out.println(kunal.marks);//96.5f

        System.out.println();

        Student sai =new Student();

        System.out.println(sai.rollno);//10
        System.out.println(sai.name);//sai
        System.out.println(sai.marks); //95.5f

        System.out.println();

        //new object
        Student akash =new Student(16,"akash",96.8f);
        System.out.println(akash.rollno);
        System.out.println(akash.name);
        System.out.println(akash.marks);
        System.out.println("aku");
        akash=new Student(25,"vamsi",25.6f);
        System.out.println(akash.name + " " + akash.rollno + " " + akash.marks);


        //creating object of another class and copying the values of one object to another
        Student random=new Student(kunal);
        System.out.println(random.name);//we can use random but good convennsion is using this

        System.out.println();

        //creating object of another class and copying the values of one object to another
        Student random2=new Student();//smith or sai//it will go to fun having 0 argumnets
        System.out.println(random2.name);
        
        System.out.println();

        //new object
        Student one=new Student();
        Student two=one;// now one two shares same object
        
        one.name="wood";//over rideing from exixting one
        System.out.println(two.name);//any change is done to one it will also reflect to two

    }

}

    //create a class
    class Student{
        int rollno;//properties 
        String name;
        float marks=90;

        void greeting(){
            System.out.println("hello my name is"+ this.name);//this will replace its name of reference varable like dif diff referece varaible has diff names
        }

        void changeName(String newname){
            this.name=newname;//this will repalce to kunal referece variable
         }

        //takes values from  other one
        Student(Student other){//other=kunal,this =random
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }

        //if student() is a empty constructor  in main is called it will call this fun,
        Student(){
            this.rollno = 10;//this will repalce to kunal refence variable
            this.name = "sai";
            this.marks = 95.5f;

            //random2
            //this is calling constructor from another constructor
            //internally :new student()
            // this(29,"smith",86.5f);//it will go to another constructor having three variables
        }


        // Student kunal=new student(15,"kunal",96.5f); here this will replace with kunal
        // if student() is a 3 parameter constructor  in main is called it will call this fun,
        Student(int rollno, String name,float marks){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }


    }
    

