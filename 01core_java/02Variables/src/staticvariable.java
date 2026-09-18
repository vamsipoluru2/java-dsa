public class staticvariable {

    // Instance Variable (object level)
    int a = 10;

    // Static Variable (class level)
    static int b = 10;

    // Constructor
    public staticvariable() {

    }

    // Method with parameters
    public void addValues(int x, int y) {

        // Local Variable
        int result = x + y;

        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {

        // args is a PARAMETER
        // args is also a local variable of main()

        // Local Variable
        int localVar = 50;

        System.out.println("Local Variable : " + localVar);

        // Accessing static variable directly
        System.out.println("Static Variable b : " + b);

        // Creating objects
        staticvariable s1 = new staticvariable();
        staticvariable s2 = new staticvariable();

        // Instance variable change
        s1.a += 5;

        // Static variable change
        b += 3;

        System.out.println("s1.a : " + s1.a); // 15
        System.out.println("b : " + b);       // 13

        System.out.println("s2.a : " + s2.a); // 10
        System.out.println("b : " + b);       // 13

        b += 3;

        System.out.println("Updated b : " + b); // 16

        // Calling method with parameters
        s1.addValues(10, 20);
    }
}