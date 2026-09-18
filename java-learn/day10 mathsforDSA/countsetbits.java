// package day10 mathsforDSA;

public class countsetbits {
    public static void main(String[] args) {
        int n = 55;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Number of set bits: " + countSetBits(n));
    }
    public static int countSetBits(int n) {
        int count = 0;
        // while (n > 0) {
        //     count ++;
        //     n-=(n&-n);
        //     // n >>= 1;
        // }
        // or
        while (n > 0) {
            count ++;
            n=(n&(n-1));
            // n >>= 1;
        }
        return count;
    }
    
}
