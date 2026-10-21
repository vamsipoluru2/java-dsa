package Striver_dsa.day03_recurrsion;

public class print_name_n_times {
    public static void main(String[] args) {
        print_name(5);
    }

    static void print_name(int n){
        if(n==0){
            return;
        }
        System.out.println("vamsi");
        print_name(n-1);
    }
}
