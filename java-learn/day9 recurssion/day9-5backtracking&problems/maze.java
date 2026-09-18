// package day9 recurssion.day9-5backtracking&problems;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path(" ",3,3);
        System.out.println(" ");
        System.out.println(pathlist(" ",3,3));
        System.out.println(" ");
        
        System.out.println(diagonal(" ",3,3) );
        System.out.println(" ");
        boolean[][] board={ {true,true,true},
                            {true,false,true},
                            {true,true,true}
    };
    pathwithobsticle("",board,0,0);
}
    static int count(int row, int column){
        if(row==1 || column==1){
            return 1;
        }
    
        int left=count(row-1,column);
        int down=count(row,column-1);
        

        return left+down;
    }

    static void path (String p, int row, int column){
        if(row==1 && column==1){
            System.out.print(p+"");
            return ;
        }
        if(row>1){
            path(p+'D',row-1,column);
        }
        if(column>1){
            path(p+'R',row,column-1);
        }
     
    }

    static ArrayList<String> pathlist(String p, int row, int column){
        
        if(row==1 && column==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(row>1){
            list.addAll(pathlist(p+'D',row-1,column));
        }
        if(column>1){
            list.addAll(pathlist(p+'R',row,column-1));
        }
        return list; 
    }

    static ArrayList<String> diagonal(String p, int row, int column){      
        if(row==1 && column==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(row>1){
            list.addAll(diagonal(p+'V',row-1,column));
        }
        if(row>1&&column>1){
            list.addAll(diagonal(p+'D',row-1,column-1));
        }
        if(column>1){
            list.addAll(diagonal(p+'H',row,column-1));
        }
        return list; 
    }
    static void pathwithobsticle(String p, boolean[][] maze,int row, int column){
      if(row==maze.length-1 && column==maze[0].length-1){
            System.out.print(p+" ");
            return ;
        }
        if(!maze[row][column]){
            return;
        }
        if(row<maze.length-1){
            pathwithobsticle(p+'D',maze,row+1,column);
        }
        if(column<maze[0].length-1){
            pathwithobsticle(p+'R',maze,row,column+1);
        } 
    }
    
}
