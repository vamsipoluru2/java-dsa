package Striver_dsa.day02_Patterns;

class Solution{

    // Function to print Pattern 7
    public void pattern6(int N) {

        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
        }
    public void pattern7(int N) {

        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j <2*N-(2 * i + 1); j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
    public void pattern8(int N) {
        // Outer loop for rows
        for (int i = 1; i < 2*N-1; i++) {
            int stars= i>N ? 2*N-i : i;
            // Print stars
            for (int j = 1; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern9(int N) {
        // Outer loop for rows
        for (int i = 1; i <=N; i++) {
            int start= i%2==0 ? 0 : 1;
                        // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public void pattern10(int N) {
     // Outer loop for rows
        for (int i = 1; i <=N; i++) {

          
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
               
            }
              // Print  spaces
            for (int j = 0; j < 2*(N-i); j++) {
                System.out.print(" ");
            }
             
            for (int j = i; j>=1; j--) {
                System.out.print(j);
               
            }

            // Move to next row
            System.out.println();
    }
}
    public void pattern11(int N) {
        // Outer loop for rows
        int num=1;
        for (int i = 1; i <=N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public void pattern12(int N) {
        // Outer loop for rows
        for (int i = 1; i <=N; i++) {

            for (char j = 'A'; j <='A'+(N-i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern13(int N) {
        // Outer loop for rows
        for (int i = 0; i <N; i++) {

            for (char j = 'A'; j <='A'+i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern14(int N) {
        // Outer loop for rows
        for (int i = 0; i <N; i++) {
        char ch=(char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print (ch+" ");
            }
            System.out.println();
        }
    }
        // Function to print Pattern 7
    public void pattern15(int N) {

        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("  ");
            }

            char c='A';
            int breakpoint=(2*i+1)/2; 
            // Print stars
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(c+" ");
                if(j<=breakpoint)c++;
                else c--;
        }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
        }
    public void pattern16(int N) {
        // Outer loop for rows
        for (int i = 0; i <N; i++) {
      
            for (char j = (char) ('E'-i); j <= 'E'; j++) {
                System.out.print (j+" ");
            }
            System.out.println();
        }
    }
    public void pattern17(int N) {
        // Outer loop for rows
        int initialSpaces = 0;
        for (int i = 0; i <N; i++) {
      
            for (int j =1; j <= N-i; j++) {
                System.out.print ("*");
            }
            
            for (int j =1; j <= initialSpaces; j++) {
                System.out.print (" ");
            }
            
            for (int j =1; j <= N-i; j++) {
                System.out.print ("*");
            }
            initialSpaces+=2;
            System.out.println();
        }

        initialSpaces = 2 * (N - 1);

        for (int i = 1; i <=N; i++) {
               
            for (int j =1; j <= i; j++) {
                System.out.print ("*");
            }
            
            for (int j =0; j <initialSpaces; j++) {
                System.out.print (" ");
            }
            
            for (int j =1; j <=i; j++) {
                System.out.print ("*");
            }
            initialSpaces-=2;
            System.out.println();
        }
    } 

    void pattern18(int N){
        for(int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(i==0 || j==0 || i==N-1 || j==N-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
              
            }
              System.out.println();
        }
    }

void pattern19(int N) {
    for (int i = 0; i <= 2 * N-1; i++) {

        for (int j = 0; j <= 2 * N-1; j++) {

            int top = i;
            int left = j;
            int right =(2 * N -2)- j;
            int bottom = (2 * N -2)- i;

            System.out.print(
                N - Math.min(
                    Math.min(top, bottom),
                    Math.min(left, right)
                )
            );
        }

        System.out.println();
    }
}
void pattern20(int N) {
    int revnum=0;
    while(N>0){
        int lastdigit=N%10;
        revnum=revnum*10+lastdigit;
        N/=10;
    }
    System.out.println(revnum);
}
}

public class loop_ptrns {
    public static void main(String[] args) {
        Solution  sol = new Solution ();
        int N = 10400  ;
        sol.pattern20(N); 
    }
}
