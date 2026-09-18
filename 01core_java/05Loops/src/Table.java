import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);
        for(int j=2;j<=num;j++) {
        	System.out.println();
        	System.out.println("Table of "+j);
        for (int i = 1; i <= 10; i++) {
            System.out.println(j + " x " + i + " = " + (j * i));
        }

        sc.close();
    }
        }
}
