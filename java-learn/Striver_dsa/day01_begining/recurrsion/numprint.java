package Striver_dsa.day03_recurrsion;

import java.util.Scanner;

public class numprint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // 1. Normal recursion: 1 to N
        System.out.println("\nNormal recursion (1 to N):");
        normalForward(1, n);

        // 2. Normal recursion: N to 1
        System.out.println("\n\nNormal recursion (N to 1):");
        normalReverse(n, n);

        // 3. Backtracking: N to 1
        System.out.println("\n\nBacktracking (N to 1):");
        backtrackReverse(1, n);

        // 4. Backtracking: 1 to N
        System.out.println("\n\nBacktracking (1 to N):");
        backtrackForward(n, n);

        sc.close();
    }


    // --------------------------------
    // 1. NORMAL RECURSION: 1 -> N
    // --------------------------------
    static void normalForward(int i, int n) {

        if (i > n) {
            return;
        }

        System.out.print(i + " ");

        normalForward(i + 1, n);
    }


    // --------------------------------
    // 2. NORMAL RECURSION: N -> 1
    // --------------------------------
    static void normalReverse(int i, int n) {

        if (i < 1) {
            return;
        }

        System.out.print(i + " ");

        normalReverse(i - 1, n);
    }


    // --------------------------------
    // 3. BACKTRACKING: N -> 1
    // --------------------------------
    static void backtrackReverse(int i, int n) {

        if (i > n) {
            return;
        }

        backtrackReverse(i + 1, n);

        System.out.print(i + " ");
    }


    // --------------------------------
    // 4. BACKTRACKING: 1 -> N
    // --------------------------------
    static void backtrackForward(int i, int n) {

        if (i < 1) {
            return;
        }

        backtrackForward(i - 1, n);

        System.out.print(i + " ");
    }
}