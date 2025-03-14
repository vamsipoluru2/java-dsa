// public class fib {
//     public static void main(String[] args) {
//         System.out.println(fibo(50));
//     }


//     static int fibo(int n){
//         if(n<=1){
//         return n;
//         }
        
//         return fibo(n-1) + fibo(n-2);//starts with zero
//     }

    
// }

public class fib {
    public static void main(String[] args) {
        // int n = 0; // Change n to compute a different Fibonacci number
        System.out.println(fibonacci(50));
    }

    public static long  fibonacci(int n) {
        return Math.round(Math.pow(((1 + Math.sqrt(5)) / 2),n)/Math.sqrt(5));
         
    }
}
