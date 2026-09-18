package day12_oops.oop3.inheritance;

class box2 {
    double h, l, w;

    // Parameterized constructor
    box2(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // Copy constructor
    box2(box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}

public class copyclass {
    public static void main(String[] args) {
        box box1 = new box(3, 4, 5);   // create original box
        box box2 = new box(box1);     // create copy using copy constructor

        System.out.println(box2.h);   // 3.0
        System.out.println(box2.l);   // 4.0
        System.out.println(box2.w);   // 5.0
    }
}
