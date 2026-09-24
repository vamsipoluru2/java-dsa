package day12_oops.oop6.compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student( 12,89.76f);
        Student rahul=new Student( 5,99.52f);


        Student sachin=new Student( 2,95.52f);
        Student vamsi=new Student( 13,77.52f);
        Student arpit=new Student( 9,96.52f);

        Student[] list={kunal,rahul,sachin,vamsi,arpit};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks-o2.marks);//- is in decending order
//            }
//        });//sorted based on the marks due to an overide method is added over student class
        //here it was taking both paarameters but checking only based on conition

        //lambda functions
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));


        ///  we can compare
        if(kunal.compareTo(rahul)<0){//java confuse between two paramters in the function which one to compare
            System.out.println("rahul has more marks");
        }

    }
}
