public class RotateImageBy90 {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Approach 1: Using extra matrix
        int[][] ans = rotate(matrix, matrix.length);

        System.out.println("Using Extra Matrix:");

        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }


        // Approach 2: Optimal - In-place
        rotateopt(matrix, matrix.length);

        System.out.println("\nUsing Transpose + Reverse:");

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    // Brute/Better: Using extra matrix
    static int[][] rotate(int[][] matrix, int n) {

        int[][] ans = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                ans[j][n - 1 - i] = matrix[i][j];

            }
        }

        return ans;
    }


    // Optimal: In-place
    static void rotateopt(int[][] matrix, int n) {

        // Step 1: Transpose
        for(int i = 0; i < n - 1; i++) {//n=3 so till 1 we go

            for(int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        // Step 2: Reverse every row
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n / 2; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}