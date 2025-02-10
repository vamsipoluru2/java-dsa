

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo("Kunal", "Rahul", "dvytsbhusc");
    }


    static void demo(String ...v) {// can use more than 0 arumnets
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
