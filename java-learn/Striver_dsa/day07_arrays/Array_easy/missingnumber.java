import java.util.Arrays;

public class missingnumber {
     public static void main(String[] args) {

    int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1}; // missing 8

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Brute Force: " + missingNumberBrute(arr,arr.length));

        System.out.println("Hashing: " + missingNumberHashing(arr));

        System.out.println("Sum: " + missingNumberSum(arr));

        System.out.println("XOR: " + missingNumberXOR(arr));
    }

    // 1. Brute Force
    static int missingNumberBrute(int[] arr,int n) {

        for (int i = 0; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {

                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }


    // 2. Better - Hashing
    static int missingNumberHashing(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] = 1;
        }
        for (int i = 0; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }


    // 3. Optimal - Sum
    static int missingNumberSum(int[] arr) {
        int n = arr.length;

        long sum = (long) n * (n + 1) / 2;

        long s2 = 0;

        for (int i = 0; i < n; i++) {
            s2 += arr[i];
        }

        return (int) (sum - s2);
    }


    // 4. Optimal - XOR
    static int missingNumberXOR(int[] arr) {

        int n = arr.length;

        int xor = 0;

        for (int i = 0; i < n; i++) {

            xor = xor ^ i;
            xor = xor ^ arr[i];
        }

        xor = xor ^ n;

        return xor;
    }


   
}