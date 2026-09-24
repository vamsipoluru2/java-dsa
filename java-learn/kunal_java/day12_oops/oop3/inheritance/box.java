package day12_oops.oop3.inheritance;

public class box{
    double l;
    double h;
    double w;
//    private double l;// this can be inherited in child class (data hiding)

    static void greeting(){
        System.out.println("i am at in box classs");
    }

    box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    //
    public double getl(){// for private data can be accessed encapsulation
        return l;
    }

//    when you are writing as main class
//    public class Main {
//        public static void main(String[] args) {
//            box b = new box();
//
//            // b.l = 10; ❌ Not allowed: l is private
//            // Instead use:
//            System.out.println("Length: " + b.getl()); // ✅ Safe access via getter
//        }
//    }


//  square side
    box(double side){//argument name can be anything but should point ot properties
//        super();//the box is the first class then hoe super is woring due to
        //every single class inherting from object class
        this.h=side;
        this.l=side;
        this.w=side;
    }
    box(double l,double h,double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }

    box(box old){

            this.h=old.h;
            this.l=old.l;
            this.w=old.w;
    }
    public void information(){
        System.out.println("running the box");
    }






}

