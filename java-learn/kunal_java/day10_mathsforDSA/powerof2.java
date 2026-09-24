// package day10 mathsforDSA;
public class powerof2 {
    public static void main(String[] args) {
        int n = 4;
        boolean isPowerOfTwo = isPowerOfTwo(n);
        System.out.println(n + " is a power of 2: " + isPowerOfTwo);
    }
    
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
    
}
