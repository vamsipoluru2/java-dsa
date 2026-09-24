package day12_oops.oop3.polymorphism;

public class objectprint {//by default in java every class extends its obj class
    int num;

    public objectprint(int num){
        this.num=num;
    }


    @Override//preety printing
    public String toString(){
        return "objectprint{"+"num"+num+'}';
    }

    public static void main(String[] args) {
        objectprint obj=new objectprint(10);
        System.out.println(obj);//here is tostring not given it will print random hashcode value
    }
}
