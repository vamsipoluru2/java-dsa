package Striver_dsa.day04_hashing;

import java.util.Scanner;

public class hash {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        // Input array size
        int n = SC.nextInt();

        // Input array
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }

        // Pre-compute the hash table
        int hash[] = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Number of queries
        int k = SC.nextInt();

        // Answer queries
        while (k-- > 0) {

            int x = SC.nextInt();

            System.out.println(hash[x]);
        }

        SC.close();
    }
}