import java.util.*;

public class _05MedianRowWiseSorted {

    /*
     * Given a row-wise sorted matrix with odd number of total elements,
     * find the median element.
     */

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        System.out.println("Brute Force Median: " + medianBrute(matrix));
        System.out.println("Binary Search Median: " + medianBS(matrix));
    }


    // ------------------------------------------------
    // 1. BRUTE FORCE
    // Flatten matrix -> sort -> return middle
    // ------------------------------------------------

    static int medianBrute(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] arr = new int[rows * cols];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);

        return arr[arr.length / 2];
    }


    // ------------------------------------------------
    // 2. OPTIMAL - BINARY SEARCH ON ANSWER
    // ------------------------------------------------

    static int medianBS(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // smallest first element and largest last element
        for (int i = 0; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        int required = (rows * cols) / 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // count elements <= mid in every row
            for (int i = 0; i < rows; i++) {
                count += upperBound(matrix[i], mid);
            }

            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }


    // Returns number of elements <= target
    static int upperBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}