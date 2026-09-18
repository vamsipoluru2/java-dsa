import java.util.Scanner;

public class userimput {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");

        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        sc.nextLine();
        System.out.println("hey %s, welcome to java programming");
        sc.close();
    }

}