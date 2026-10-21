package Striver_dsa.day03_recurrsion;

public class sumofN_num {
    public static void main(String[] args) {
        int n = 5;
        sumOfN(n,0);
        //functional way
        System.out.println(sum(n));
        System.out.println(fact(n));
    }

   //factorial of n numbers
    //functional way
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

    
 //sum of n numbers        //functional way
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n+sum(n-1);
    }



    //normal way
    static void sumOfN(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumOfN(n-1,sum+n);
    }
    
}
