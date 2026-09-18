import java.util.Scanner;

public class findithbit {
    
    // Function to find the i-th bit of a number
    public static int findIthBit(int number, int i) {
        return (number >> i) & 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the value of i (bit position): ");
        int i = sc.nextInt();

        if (i < 0) {
            System.out.println("Bit position cannot be negative.");
        } else {
            // Call the function and print the result
            int bit = findIthBit(number, i);
            System.out.println("The " + i + "-th bit is: " + bit);
        }

        sc.close();
    }
}
