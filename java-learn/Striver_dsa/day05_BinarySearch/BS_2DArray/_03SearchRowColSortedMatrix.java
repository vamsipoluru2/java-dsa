public class _03SearchRowColSortedMatrix {

    /*
     * Given a matrix sorted row-wise and column-wise,
     * search for a target and return true if it exists.
     */

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target = 9;

        System.out.println("Brute Force: " + linearSearch(matrix, target));
        System.out.println("Row-wise BS: " + binarySearchRows(matrix, target));
        System.out.println("Optimal: " + optimalSearch(matrix, target));
    }

    static boolean linearSearch(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    static boolean binarySearchRows(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[i].length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                }
                else if (matrix[i][mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    static boolean optimalSearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            // current is too large
            else if (matrix[row][col] > target) {
                col--;
            }
            // current is too small
            else {
                row++;
            }
        }
        return false;
    }
}