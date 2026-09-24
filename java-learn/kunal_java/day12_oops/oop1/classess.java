package day12_oops.oop1;

public class classess {

    public static void main(String[] args) {

//        store 5 roll nos
        int[] numbers = new int[5];
        //store 5 names
        String[] names = new String[5];

        //data of 5 students:(rollno,name,marks)
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //but different data types in same class accessible using classes
        Students[] students = new Students[5];//own data type

//        any of two type declaration
//        Students kunal=new Students();//new will dynamically alots memory at run time and returning reference to it


        //by default Students is called then we overides the value is student name is also not there then it goes to default value
        Students kunal = new Students();//declaration
        //before initilization in class
//      System.out.println(kunal.rollno);//NOT INITLIED SO defult 0;

//      intilization // overriding
        kunal.rollno = 10;
        kunal.name = "kunal kuashwaha";
//        kunal.marks = 85.5f;
        kunal.greeting();
//      after initilizaton in class
        System.out.println(kunal.rollno);//10  initiled so value is printed
        System.out.println(kunal.name);//kunal kushawaha
        System.out.println(kunal.marks);//85.5f

        System.out.println();

        Students sai=new Students();// new object sai is created so
        //it checks the fun in  the class and goes into it
        sai.greeting();
        System.out.println(sai.rollno);//10
        System.out.println(sai.name);//sai
        System.out.println(sai.marks); //95.5f

        Students vamsi=new Students(21,"vamsi",34);
        System.out.println(vamsi);

    }
}

    class Students{
        int rollno;//initialize properties
        String name;
        float marks=90;//if no value is initilized then default value(90) will be taken

        void greeting(){//method
            System.out.println("hello my name is "+ this.name);//this will replace its name of
            // reference variable like dif diff reference variable has diff names
        }

        //WE need  a way to add the values of the above
        //properties object by object
        // we need one word to access every objecct that is This key word
        Students(){//constructor
            this.rollno = 10;//this will repalce to sai refence variable
            this.name = "sai";
            this.marks = 95.5f;

        }
        Students(int rollno, String name, float marks){
            this.rollno = rollno;//this will repalce to sai refence variable
            this.name = name;
            this.marks = marks;

        }

        @Override
        public String toString() {
            return "Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks;
        }

       private class Nama{
            int vamsi;
        }



    }


