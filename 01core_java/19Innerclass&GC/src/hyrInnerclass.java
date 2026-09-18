public class hyrInnerclass {

    private int id=101;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // testclass t1=new testclass();//you cannot access here 
        //you can use outclass obj to access the inner class
        testclass t1=new hyrInnerclass().new testclass();
        t1.display();
        t1.add();
    }
    //inner class
    class testclass {
        public void display() {
            System.out.println("This is a test class.");
            System.out.println("id = " + id);//inner class can access private members
        }
        public void add(){
            testclass2 t2 = new testclass2();//ypu can create obj 
        }

    } 
    public class testclass2 {
        void display2() {
            System.out.println("This is a test class 2.");
            testclass tc=new testclass();//inner class to inner class can access each other without any obj creation
            tc.display();
        }


    }
    private class testclass3 {
        void display() {
            System.out.println("This is a test class 3.");
        }
    }
    protected class testclass4 {
        void display() {
            System.out.println("This is a test class 4.");
        }
    }

    public static class testclass5 {
        void display() {
            System.out.println("This is a test class 5.");
        }
    }
    private abstract class testclass6 {
        abstract void display();
    }
    protected final class testclass7 {
        void display() {
            System.out.println("This is a test class 7.");
        }
    }
    // the private puvlic protected can interchange but the static and final cannot be used together with the inner class.
    
}

//outer class
class Outerclass {
    public static void main(String[] args) {
        System.out.println("outer class");
    }
}
//you cant have more than one public class in a single file, but you can have multiple non-public classes.
// public class Outerclass2 {
//     public static void main(String[] args) {
//         System.out.println("outer class 2");
//     }
// }