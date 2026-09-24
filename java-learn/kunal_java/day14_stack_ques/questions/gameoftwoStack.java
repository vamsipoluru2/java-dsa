package day14_stack_ques.questions;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;
import java.util.Scanner;

class Main{
        static int twoStacks(int x,int[] a,int[] b){
            return twoStacks(x,a,b,0,0)-1;
        }

        private static int twoStacks(int x,int[] a,int[] b,int sum,int count){
            if(sum>x){
                return count;
            }

            if(a.length==0||b.length==0){//empty
                return count;
            } //arrays .copyofrange(array a from 1 to end ) slice it
            int ans1=twoStacks(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
            int ans2=twoStacks(x,a, Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);

            return Math.max(ans1,ans2);
        }

         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             int g = scanner.nextInt(); // Number of games

             for(int j=0;j<g;j++) {
                 int n = scanner.nextInt(); // Size of stack a
                 int m = scanner.nextInt(); // Size of stack b
                 int x = scanner.nextInt(); // Max sum

                 int[] a = new int[n];
                 int[] b = new int[m];

                 for (int i = 0; i < n; i++) {
                     a[i] = scanner.nextInt();
                 }

                 for (int i = 0; i < m; i++) {
                     b[i] = scanner.nextInt();
                 }

                 int result = twoStacks(x, a, b);
                 System.out.println(result);
             }
             scanner.close();
         }

}
