package day12_oops.oop3.inheritance;

public class Main {
    public static void main(String[] args) {
        box box1=new box();
        box box2=new box(4,7.9,8);//depending upon arguments it will select the function in the class
        box box3=new box(box2);//cpy of box 1 //old in box class

        box2.information();

//        box2.getl();//data hiding

        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        System.out.println(box3.l+" "+box3.w+" "+box3.h);

        boxweight box4=new boxweight();//child class that has zero arguments will be called
        // referncing parent to child
        System.out.println(box3.h+" "+box4.weight);

        boxweight box5=new boxweight(2,3,4,5);
//      This is due to inhertance
        System.out.println(box5.l+" "+box5.w+" "+box5.h+" "+box5.weight);

        //here box is a parent class  so it can access properties of box weight
        box box6=new boxweight(2,3,4,8);
//      System.out.println(box6.weight);//although the boxweight is avble as a costructor
//      //it is type of reference variable that actually determines what members can be access not type of object

        //there are many variables in both parent and child class
        //you are given access to variables that are in the ref type i.e Box weight
        //hence you should have access to weight variable
        //thus also means that the ones you are trying to access should be initilised
        //but here when the obj itself is of type parent class ,how will you call the constructor oof chid class
        //this is why error
//        boxweight box7=new box(7,8,9);//the object itself is parent
//        System.out.println(box7);//above classes dosent know the info about below class but below classees know the above classes information


        boxprice box8=new boxprice(2,20,100);
        System.out.println(box8.l+" "+box8.w+" "+box8.h+" "+box8.weight+" "+box8.cost);


        boxweight box10=new boxweight();
        System.out.println(box10.l+" "+box10.h+" "+box10.w+" "+box10.weight);





//        box1.greeting();
        box.greeting();//conventional
//        greeting is static one

        // can we overridde static method

        box box=new boxweight();//parent class name = child constructor
        box.greeting();//it was calling which was there in the box class even though we are pointing to boxweight class
        //bcs static will not override if you remove form parent box class then it will call child obj which you assigned

        //overriding depends on object
        // static stuff dosento depend on object
        //static stff elemenate all the obj

        //you can inherit but cant overide
        box box9=new boxweight();
        boxweight.greeting();//inherit

    }
}
