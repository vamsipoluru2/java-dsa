import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		//for loop
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a Number: ");
	    int x = sc.nextInt();
	    
	    for(int i=0;i<x;i++) {
	    	System.out.println(i);
	    }
	    
	    int a = 0;
	    while(a<=x) {
	    	System.out.println(a);
	    	a++;
	    	
	    }
	    
	    //do while
	    int i = 1;

        do {
            System.out.println("Number: " + i);
            i++;
        } while (i >= 10);
    
        sc.close();
	}
}
 