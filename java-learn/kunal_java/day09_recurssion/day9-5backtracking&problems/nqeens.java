// package day9 recurssion.day9-5backtracking&problems;

public class nqeens {
    public static void main(String[] args) {
       int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queens(board, 0));
        //checking for every single case and giving answer at last

        
    }

    static int queens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        //placing the queen and checking for every row and column
        int count=0;
        for(int col=0; col<board[row].length; col++){
            //place the queen if its safe
            if(isSafe(board,row,col)){
                board[row][col]=true;//place the queen
                count+=queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }  
    
    private static boolean isSafe(boolean[][]board,int row,int col){
        //check vertical row for next queen to place
        for(int i=0; i<row; i++){
            if(board[i][col]){//if board contains queen
                return false;//it is not safe to place it
            }
        }
        //check upper left diagonal
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //checking right diagoal
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;//placing queen


    }
    static void display(boolean[][] board){
        for(boolean[] row : board){//for every row i board
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();

        }

    }
}
