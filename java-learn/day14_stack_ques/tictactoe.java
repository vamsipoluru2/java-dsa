package day14_stack_ques;

import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int row=0;row< board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        Scanner scanner=new Scanner(System.in);

        while (!gameOver){
            printBoard(board);
            System.out.println("player "+player+" enter:");
            int row=scanner.nextInt();
            int col=scanner.nextInt();

            if(board[row][col]==' '){
                board[row][col]=player;//putting in space
                gameOver=havewon(board,player);
                if(gameOver){
                    System.out.println("palayer"+player+"hasWon");
                }else{
//                    if(player=='X'){
//                        player='O';//switching from one player to another player
//                    }else{
//                        player='X';
//                    }
                    player=(player=='X')?'O':'X';
                }
            }else{
                System.out.println("Invalid move.Tryagain!");
            }
        }
        printBoard(board);
    }

    public static boolean havewon(char[][] board,char player){
        //check the rows
        for(int row=0;row< board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2] == player){
                return true;
            }
        }

        //check the col
        for(int col=0;col< board.length;col++){
            if(board[0][col]==player && board[1][col]==player && board[col][2] == player){
                return true;
            }
        }
        //check the diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2] == player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0] == player){
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for(int row=0;row< board.length;row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println( );
        }
    }
}
