package day12_oops.oop3.inheritance;

// it want all the properties that has box
public class boxweight extends box{//single inhertance
    double weight;

     public boxweight(){
         this.weight=-1;
     }
//@Override it was not overriding
    static void greeting(){
        System.out.println("i am at in boxweight classs");
    }

     boxweight(boxweight other){// box eeight has access to all other in box
         super(other);
         weight=other.weight;
     }

     boxweight(double side,double weight){
         super(side);//box  that has 3 argumnets
         this.weight=weight;
     }

     public boxweight(double l,double h,double w,double weight){

         super(l,w,h);//call the parent class constructor
         //used to initialise the values present in parent class

//         System.out.println(super.w);//refer that present in main class
         this.weight=weight;//manally
     }

}
