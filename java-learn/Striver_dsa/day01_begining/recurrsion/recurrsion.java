package Striver_dsa.day03_recurrsion;

public class recurrsion {
    
    static int cnt=0;
    public static void main(String[] args) {
        f(5);
    }

    static void f(int n){
        if(cnt==n){
            return;
        }
        System.out.print(cnt + " ");
        cnt++;
        f(5);
    }
}

    
