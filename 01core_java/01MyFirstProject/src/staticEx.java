class Outer {
    static class Nested {
        static int num = 10; // static variable inside nested class

        static void show() {
            System.out.println("Num = " + num);
        }
    }
}

public class staticEx {
    public static void main(String[] args) {
        // Accessing static variable directly using class name
        System.out.println(Outer.Nested.num);

        // Accessing static method of nested class
        Outer.Nested.show();
    }
}
