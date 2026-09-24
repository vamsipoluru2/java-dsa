package day12_oops.oop7.EnumsExamples;

public class basic {//cant extends and super calss also
    enum Week implements A{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        //these are enum constants
        //these are public static and final member
        //since its final you can create child enums but we can use interace
        //type is week

//        void dispaly();//abstract is not allowed requiers body

        @Override
        public void hello() {
            System.out.println("hello how are you");
        }
    }


//     Week(){
//        System.out.println("constructor called for"+this);
//        //this is not public or protected only private or defult
//        //why ? we dont wnat to creeate new objects
//        //this is not enum concepts thats why
//        //internally public Static final Week monday=new Week();
//    }

    public static void main(String[] args) {
        Week week;
        week=Week.monday;
        week.hello();//calling from mwethod in enum implements class
        System.out.println(Week.valueOf("monday"));//enumconstant

        System.out.println();
        for(Week day:Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());//position of that week memnber

    }
}
