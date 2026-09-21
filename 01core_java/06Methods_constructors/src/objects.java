public class objects{

    public objects(){

        System.out.println("i am a paramterlessconstructor");
    }
    public objects(int a){

        System.out.println("i am a parameterized constructor");
    }
    public static void main(String[] args) {
        objects ob=new objects();//every obj is different and stored in different memory location in java
        objects ob2=new objects(10);
        System.err.println(ob);// it will print the address of the object
        System.err.println(ob2);//  it will print the address of the object
    }
}