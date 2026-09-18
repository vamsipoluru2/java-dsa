public class Typeconversion {

    public static void main(String[] args) {

        byte b = 10;        // -128 to 127
        short s = 50;       // -32,768 to 32,767
        int i = 300;        // -2,147,483,648 to 2,147,483,647
        float f = 25.1f;    // f is float
        long l = 7895463L;  // l is long
        double d = 52.55;   // d is double

        char ch = 'A';      // single character
        boolean bo = true;  // true or false

       // int -> byte
        b = (byte) i;
        System.out.println("int to byte: " + b);


        // int -> short
        s = (short) i;
        System.out.println("int to short: " + s);


        // long -> int
        int x = (int) l;
        System.out.println("long to int: " + x);


        // double -> int
        int y = (int) d;
        System.out.println("double to int: " + y);


        // double -> float
        float z = (float) d;
        System.out.println("double to float: " + z);


        // int -> char
        char c = (char) i;
        System.out.println("int to char: " + c);


        // char -> byte
        byte a = (byte) ch;
        System.out.println("char to byte: " + a);


        // float -> int
        int p = (int) f;
        System.out.println("float to int: " + p);

        //cannot cast boolen to any other in top bcs incaompatable type
    }
}