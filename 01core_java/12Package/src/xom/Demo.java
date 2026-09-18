package xom;

import com.Outer;

public class Demo {

    public static void main(String[] args) {

        Outer out = new Outer();

        // ============================
        // PUBLIC INNER CLASS
        // accessible in other package
        // ============================

        Outer.InnerPublic pub = out.new InnerPublic();

        pub.show();

        // ============================
        // PROTECTED INNER CLASS
        // NOT accessible directly
        // because not subclass
        // ============================

        // Outer.InnerProtected pro = out.new InnerProtected();
        // ❌ ERROR

        // ============================
        // DEFAULT INNER CLASS
        // accessible only in same package
        // ============================

        // Outer.InnerDefault def = out.new InnerDefault();
        // ❌ ERROR

        // ============================
        // STATIC INNER CLASS
        // accessible because same package-level visibility
        // ============================

        // Outer.StaticInner si = new Outer.StaticInner();
        // ❌ ERROR because StaticInner is default

        // ============================
        // toString() concept
        // ============================

        Demo d = new Demo();

        String s = "hello";

        // Object class toString() called implicitly
        System.out.println(d);

        // String class overrides toString()
        System.out.println(s);
    }

    // overriding toString()
    public String toString() {

        return "I am Demo Object";
    }
}