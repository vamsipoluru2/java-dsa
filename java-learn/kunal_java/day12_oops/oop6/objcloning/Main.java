package day12_oops.oop6.objcloning;

import javax.lang.model.element.Name;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human kunal=new human(25,"kunal kaushwaha");
//        human twin=new human(kunal);instead of this

        //creation off deep copy
        human twin=(human)kunal.clone();
        System.out.println(twin.age+" "+twin.name);

// uncomment with shallow copy in human class
//        System.out.println("shallow cpy");
//        System.out.println(Arrays.toString(twin.arr));
//        System.out.println(Arrays.toString(kunal.arr));
//        twin.arr[0]=35;//for non primitives it is not creating new one it is pointing to old one// so it was changing if int was given then it wll wont copy
//        System.out.println(Arrays.toString(kunal.arr));

////Helps if we make any changes in copied object it wont change in main class obj
        System.out.println("deep copy");
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=35;//twin s changed but kunal is not changed
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));

        System.out.println(twin.name);

        System.out.println("kunal.name: " + kunal.name);
        System.out.println("twin.name: " + twin.name);

        twin.name="vamsi";
        System.out.println("kunal.name: " + kunal.name);
        System.out.println("twin.name: " + twin.name);
    }
}
