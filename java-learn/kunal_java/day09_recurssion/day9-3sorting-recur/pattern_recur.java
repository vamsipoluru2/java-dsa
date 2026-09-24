public class pattern_recur {
    
    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(4, 0);
        
    }

    static void triangle(int row, int col){
        if(row ==0){
            return;
        }
        if(col<row){/******** */
             System.out.print("*");//each row
             triangle(row,col+1);
            }else{
                System.out.println();
                triangle(row-1, 0);//next row traves
            }
        }

        static void triangle2(int row, int col){
            if(row ==0){
                return;
            }
            if(col<row){
                triangle2(row,col+1);
                System.out.print("*");//excuite when fuhnction is exiting from the stack
                 
                }else{
                    triangle2(row-1, 0);//next row traves
                    System.out.println();
                }
            }
}
