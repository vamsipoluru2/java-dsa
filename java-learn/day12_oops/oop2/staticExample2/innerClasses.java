package day12_oops.oop2.staticExample2;

public class innerClasses {
    //this class test itself depend on outer class i.e if it was putside it can do it own obj

    static class Test{  //if static is used then it wont depend  on obj in innerclasses class so staic main can use it
        String name;//

        public  Test(String name){//constructor to take name
            this.name=name;
        }

        @Override
       public String toString() {
           return name;
       }
   }

    public static void main(String[] args) {
        Test a= new Test("kunal");//obj creation
        Test b= new Test("rahul");

        //it is a tostring method so it will go to class and see to string method if there return tostring one
        // or it will return hashcode value
        System.out.println(a);//kunal

//        how they havve unique identity due to it will not depend on main class
        System.out.println(a.name);//kual
        System.out.println(b.name);//rahul

    }
}
