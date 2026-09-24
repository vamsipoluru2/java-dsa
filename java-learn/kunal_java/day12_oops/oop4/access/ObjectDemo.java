package day12_oops.oop4.access;

public class ObjectDemo {
    int num;
    float gpa;
    //already covered
    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();//gc garbage hits
//    }


    public ObjectDemo(int num,float gpa){
            this.num=num;
            this.gpa=gpa;

    }

    //NUM REPRESENTATION OF AN OBJ
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num;// gives num
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;//it is checking only num so it prints
        //here we are over riding to check only num although it has 2 arguments
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //hashcode gives a number to identify same obj or diff obj
    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(34,56.8f);
        ObjectDemo obj1=new ObjectDemo(34,16.6f);
        ObjectDemo obj3=obj;//both are pointing to same variable

        ObjectDemo obj2=new ObjectDemo(34,78.9f);




        if(obj==obj3){
            System.out.println("obj is equal too obj2");
        }

        if(obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());//stored in heap memory



        System.out.println(obj.hashCode());//generates random number
        System.out.println(obj3.hashCode());//gives same num due to points to same obj
        System.out.println(obj1.hashCode());



    }

}
