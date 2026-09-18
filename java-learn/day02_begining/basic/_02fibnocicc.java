package basic;

public class _02fibnocicc {

    public static void main(String[] args) {
            int n = 10; // Change this to get more Fibonacci numbers
            fibonacci(n);
        }

        public static void fibonacci(int n) {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + " " + b + " ");

//            int count=0;
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + " ");
//                count++;
                a = b;
                b = next;
            }
//            System.out.println(count);
        }
    }

