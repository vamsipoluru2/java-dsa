package com;

public class AccessModifiers {

    public static void main(String[] args) {

        Outer out = new Outer();

        // ============================
        // PUBLIC INNER CLASS
        // accessible everywhere
        // ============================

        Outer.InnerPublic pub = out.new InnerPublic();

        pub.show();

        // ============================
        // PROTECTED INNER CLASS
        // accessible in same package
        // ============================

        Outer.InnerProtected pro = out.new InnerProtected();

        pro.show();

        // ============================
        // DEFAULT INNER CLASS
        // accessible in same package
        // ============================

        Outer.InnerDefault def = out.new InnerDefault();

        def.show();

        // ============================
        // PRIVATE INNER CLASS
        // NOT accessible outside Outer
        // ============================

        // Outer.InnerPrivate pri = out.new InnerPrivate();
        // ❌ ERROR

        // ============================
        // STATIC INNER CLASS
        // no need of outer object
        // ============================

        Outer.StaticInner si = new Outer.StaticInner();

        si.display();

        System.out.println(Outer.StaticInner.msg);

        // accessing private inner through method
        out.accessPrivateInner();
    }
}