// package day11 mathsfordsa2;

public class primenum {
    public static void main(String[] args) {
        int num = 10; 
        for (int i = 2; i <=num; i++) {
        System.out.println(i+" "+isPrime(i));
        // boolean x=isPrime(num); 
        // System.out.println(x?"prime":"not prime");
    }

        
        
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){//reducimg half search
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
