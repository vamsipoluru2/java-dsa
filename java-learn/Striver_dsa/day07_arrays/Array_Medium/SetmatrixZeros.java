public class SetmatrixZeros {
    /*
     * If an element in the matrix is 0,
     * set its entire row and column to 0.
     */

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1,1},
            {1, 0, 0,1},
            {1, 1, 0,1},
            {1, 1, 1,1}
        };

        setMatrixOptimal(matrix);
        printMatrix(matrix);
    } 

    static void setZeroesBrute(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        // Mark rows and columns using -1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }
        // Convert all marked cells to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
    }
    static void markRow(int[][] matrix, int row) {

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    static void markCol(int[][] matrix, int col) {

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }

    // Use row[] and col[] marker arrays

    static void setZeroesBetter(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];
        // Mark rows and columns containing 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        // Set cells to 0 if their row or column is marked
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void setMatrixOptimal(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int col0 = 1;

        // Step 1: Use first row and first column as markers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // mark row
                    matrix[i][0] = 0;
                    // mark column
                    if (j != 0) { 
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Set inner matrix cells to 0
        // Do not modify first row/column yet
        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {

            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (col0 == 0) {

            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

}


    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}

