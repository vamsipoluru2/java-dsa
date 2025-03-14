
import java.util.Scanner;
public class numprint {
     public static void main(String[] args) {
           
            System.out.print("enter a number: ");
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            print(n);
            System.out.println(" ");
            fun(n);
            System.out.println(" ");
            funrev(n);
            System.out.println(" ");
            concept(n);
            sc.close();
        }
        static void print(int n){
    
            //base case 
            if(n>5) {
                return ;//till here enough   
            }
            //recursive part 
            System.out.print(n+" ");//decresing order
            print(n+1);
            
            // return;  
        }
        static void fun(int n){//o(n)
            //base case 
            if(n==0) {
                return ;//till here enough   
            }
            //recursive part 
            System.out.print(n+" ");//
            fun(n-1);
            
            // return;
        }
        static void funrev(int n){
            //base case 
            if(n==0) {
                return ;//till here enough   
            }
            //recursive part
            funrev(n-1); 
            System.out.print(n+" ");//increasing order
            
            
            // return;
        }

        //passing num

        static void concept(int n){
            //base case 
            if(n==0) {
                return ;//till here enough   
            }
            //recursive part
            System.out.print(n+" ");
            concept(--n); 
            //increasing order  n-- vs --n 
            //n-- means first pass value and subtract and  --n is opp
            
            
            // return;
        }

        
}



