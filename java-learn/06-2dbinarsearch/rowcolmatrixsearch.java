// package day4_3 2Dbinarykunal;
import java.util.Arrays;

public class rowcolmatrixsearch {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=45;
        System.out.println(Arrays.toString(search(matrix, target)));
        
    }
    static int[] search(int[][] matrix,int target){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
                }else{
                    col--;
                }

            }
            return new int[]{-1,-1};
        }
}
