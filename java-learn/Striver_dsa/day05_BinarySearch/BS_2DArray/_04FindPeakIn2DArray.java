public class _04FindPeakIn2DArray {

    public static void main(String[] args) {

        int[][] mat = {
            {4, 2, 5, 1, 4, 5},
            {2, 9, 3, 2, 3, 2},
            {1, 7, 6, 0, 1, 3},
            {3, 6, 2, 3, 7, 2}
        };

        _04FindPeakIn2DArray sol = new _04FindPeakIn2DArray();

        int[] ans = sol.findPeakGrid(mat);

        System.out.println(
            "The row of peak element is " + ans[0] +
            " and column of peak element is " + ans[1]
        );
    }


    static int[] findPeakGrid(int[][] arr) {

        // int n = arr.length;
        int m = arr[0].length;

        int low = 0;
        int high = m - 1;

        // Binary search on columns
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Find row having maximum element in mid column
            int row = maxElement(arr, mid);

            int left =mid - 1 >= 0? arr[row][mid - 1]: Integer.MIN_VALUE;//for first column, left element is -infinity
            int right =mid + 1 < m? arr[row][mid + 1]: Integer.MIN_VALUE;//`for last column, right element is -infinity 
            // Peak found
            if (arr[row][mid] > left && arr[row][mid] > right) {
                return new int[]{row, mid};
            }
            // Bigger element exists on left
            else if (left > arr[row][mid]) {
                high = mid - 1;
            }
            // Bigger element exists on right
            else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }


    // Find row index containing maximum value in given column
    static int maxElement(int[][] arr, int col) {

        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int row = 0; row < arr.length; row++) {

            if (arr[row][col] > max) {

                max = arr[row][col];
                index = row;
            }
        }

        return index;
    }
}