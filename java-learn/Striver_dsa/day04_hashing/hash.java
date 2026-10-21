package Striver_dsa.day04_hashing;

import java.util.Scanner;

public class hash {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }

        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        int k = SC.nextInt();
        while (k-- > 0) {
            int x = SC.nextInt();
            System.out.println(hash[x]);
        }
        SC.close();
    }
}