import java.util.Scanner;

public class sumofdigts {

  
        public static void main(String[] args) {
            System.out.print("enter a number: ");
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();
            System.out.println(sum(n));
            System.out.println(product(n));
    
    }
       static int sum(int n){
    
            //base case 
            if(n==0) {
                return 0;//till here enough
               
            }
            //recursive part 
          return  (n%10)+sum(n/10);//f(1234)
                                     // |-->{4+f(123)}
                                    //            |
 }                                 //              -->{3+f(12)}  so on goes till n becomes 0 


static int product(int n){
    
    //base case 
    if(n%10 == n) {
        return n;//till here enough
       
    }
    //recursive part 
  return  (n%10)*sum(n/10);//f(1234)
                             // |-->{4*f(123)}
                            //            |
}                                 //              -->{3*f(12)}  so on goes till n becomes 0 
}


