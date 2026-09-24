package day12_oops.oop6.objcloning;

//if ypu want to clone an obj you have implement cloneable-> this will allow to clone
public class human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr =new int[]{3,4,5,6,9,1};
    }
//
//    public human(human other){
//        other.name=other.name;
//        other.age=other.age;
//
//    }

////    if you write below code no need to implement new funcion with other as parameter
////shallow copy
//    public Object clone() throws CloneNotSupportedException {
//        //shallow copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
////      this is deep copy
         human twin=(human)super.clone();//this is shallow cpy make it deeep cpy
         twin.arr=new int[twin.arr.length];//make new array
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }

        twin.name =new String(this.name);

        return twin;
    }
}
