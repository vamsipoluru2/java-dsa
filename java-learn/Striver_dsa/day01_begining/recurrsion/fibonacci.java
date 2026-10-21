package Striver_dsa.day03_recurrsion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fact(9));
    }

    static int fact(int n){
        if(n==0) return 1;
         return n*fact(n-1);
    }
    static int fib(int n){
    if(n<=1){
        return n;
    }

    return fib(n-1) + fib(n-2);

   }
    
}
