public class _02SearchIn2Darray {
      
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        System.out.println("Linear Search: " + linearSearch(matrix, target));
        System.out.println("BS in each row: " + binarySearchRows(matrix, target));
        System.out.println("Flattened BS: " + flattenedBinarySearch(matrix, target));
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

    static boolean flattenedBinarySearch(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n*m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}