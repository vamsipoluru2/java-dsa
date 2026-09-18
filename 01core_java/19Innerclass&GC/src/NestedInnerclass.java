
class Outer {
    int outerVar = 50;         // instance variable
    static int staticVar = 100; // static variable

    // 1️⃣ Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("StaticNested: staticVar = " + staticVar);
        }
    }

    // 2️⃣ Member Inner Class
    class Inner {
        void display() {
            System.out.println("Inner: outerVar = " + outerVar);
        }
    }

    // 3️⃣ Method with Local Inner Class
    void outerMethod() {
        int localVar = 30; // effectively final

        class LocalInner {
            void display() {
                System.out.println("LocalInner: localVar = " + localVar);
            }
        }

        LocalInner li = new LocalInner();
        li.display();
    }

    // 4️⃣ Anonymous Inner Class
    void anonymousExample() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class: Running...");
            }
        };
        r.run();
    }
}

public class NestedInnerclass {
    public static void main(String[] args) {
        // Static Nested Class
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.display();

        // Member Inner Class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Local Inner Class
        outer.outerMethod();

        // Anonymous Inner Class
        outer.anonymousExample();
    }
}
