package com;

// Outer class
public class Outer {

    // PRIVATE INNER CLASS
    private class InnerPrivate {

        // method also public
        public void show() {

            System.out.println("Private Inner Class");
        }
    }

    // PROTECTED INNER CLASS
    protected class InnerProtected {

        public void show() {

            System.out.println("Protected Inner Class");
        }
    }

    // PUBLIC INNER CLASS
    public class InnerPublic {

        public void show() {

            System.out.println("Public Inner Class");
        }
    }

    // DEFAULT INNER CLASS
    class InnerDefault {

        public void show() {

            System.out.println("Default Inner Class");
        }
    }

    // STATIC INNER CLASS
    static class StaticInner {

        static String msg = "Hello from Static Inner Class";

        public void display() {

            System.out.println(msg);
        }
    }

    // accessing private inner class inside outer class
    void accessPrivateInner() {

        InnerPrivate p = new InnerPrivate();

        p.show();
    }
}