// Java Program to print pattern
// Reverse Right Half Pyramid
// import java.util.*;
public class star{
public static void main(String args[])

   
    {
        int i, j,n=5,k;

        // outer loop to handle rows
        for (i = 1; i <=n; i++) {

            int spaces=i-1;
            // inner loop to handle columns
            
            for (j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            for(k=1;k<=spaces;k++){
                System.out.print(" ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
   