// package day9 recurssion.day9-5backtracking&problems;
import java.util.Arrays; 
public class mazealpaths {
    public static void main(String[] args) {
        boolean[][] board={ {true,true,true},
                            {true,true,true},
                            {true,true,true}
    };
    Allpaths("",board,0,0);
    int[][] path = new int[board.length][board[0].length];
    AllpathsprintinArray("", board, 0, 0, path, 1);

        
    }
    static void Allpaths(String p, boolean[][] maze,int row, int column){
        if(row==maze.length-1 && column==maze[0].length-1){
              System.out.print(p+" ");
              return ;
          }
          if(!maze[row][column]){
              return;
          }

          //make change to flase while going through
          maze[row][column] = false;
          //exploring all the possible path
          
          if(row<maze.length-1){
              Allpaths(p+'D',maze,row+1,column);
          }
          if(column<maze[0].length-1){
              Allpaths(p+'R',maze,row,column+1);
          } 
          if(row>0){
             Allpaths(p+'U',maze,row-1,column);
          }
          if(column>0){
             Allpaths(p+'L',maze,row,column-1);
          }
          //thiss line is where the function willl be over
          //so before gets removed also remove the changes that were made by the function
          maze[row][column] = true;// while going back make it true

        }


      static void AllpathsprintinArray(String p, boolean[][] maze,int row, int column,int[][] path,int step){
        if(row==maze.length-1 && column==maze[0].length-1){
            path[row][column]=step;
            for(int[] array : path){
              System.out.println(Arrays.toString(array));
          }
          System.err.println(p);
          System.out.println();
          return ;
        }
          if(!maze[row][column]){
              return;
          }

          //make change to flase while going through
          maze[row][column] = false;
          path[row][column]=step;//it that path the step value is added
          //exploring all the possible path
          
          if(row<maze.length-1){
            AllpathsprintinArray(p+'D',maze,row+1,column,path,step+1);
          }
          if(column<maze[0].length-1){
            AllpathsprintinArray(p+'R',maze,row,column+1,path,step+1);
          } 
          if(row>0){
            AllpathsprintinArray(p+'U',maze,row-1,column,path,step+1);
          }
          if(column>0){
            AllpathsprintinArray(p+'L',maze,row,column-1,path,step+1);
          }
          //thiss line is where the function willl be over
          //so before gets removed also remove the changes that were made by the function
          maze[row][column] = true;// while going back make it true
          path[row][column] = 0;//back track put it as zero
      }
    
}
