import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Take array size
        int n = sc.nextInt();

        // 2. Create array
        int[] arr = new int[n];

        // 3. Take array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 4. Print array
        System.out.println(Arrays.toString(arr));

        // 5. Print elements one by one
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}