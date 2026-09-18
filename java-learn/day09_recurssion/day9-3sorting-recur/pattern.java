public class pattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern6(4);
        pattern7(4);
        pattern8(4);
        pattern9(4);
        pattern10(4);
    }
    
    static void pattern1(int n){
        System.out.println("pattern 1");
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        System.out.println("pattern 2");
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }

    static void pattern3(int n){
        System.out.println("pattern 3");
        for(int row=1;row<=n;row++){ //EACH row
            for(int col=1;col<=n+1-row;col++){//each column
                System.out.print("* ");
                
            }
            System.out.println();
        }   
    }

    static void pattern4(int n){
        System.out.println("pattern 4");
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        System.out.println("pattern 5");
        for(int row=1;row<=2*n-1;row++){//EACH row

            int c=row>n?2*n-row:row; 
            for(int col=1;col<=c;col++){//each column
                System.out.print("* ");
                
            }
            System.out.println();
        }   
    }

    static void pattern6(int n){
        System.out.println("pattern 6");
        for(int row=1;row<=2*n;row++){//EACH row
            
            int totalcol=row>n?2*n-row:row; 

            int nofospace=n-totalcol;
            for(int i=1;i<=nofospace;i++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcol;col++){//each column
                System.out.print("* ");
                
            }
            System.out.println();
        }   
    }

    static void pattern7(int n){
        System.out.println("pattern 7");
        
        for(int row=1;row<=n;row++){
       
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        System.out.println("pattern 8");
        for(int row=1;row<=2*n;row++){//EACH row
            
            int totalcol=row>n?2*n-row:row; 

            int nofospace=n-totalcol;
            for(int i=1;i<=nofospace;i++){
                System.out.print("  ");
            }
            for(int col=totalcol;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=totalcol;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }   
    }

    static void pattern9(int n) {
        System.out.println("pattern 9");
        int size = 2 * n - 1; // Calculate the total size of the grid
    
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Calculate the number to print based on the minimum distance to any edge
                int value = n - Math.min(Math.min(row, col), Math.min(size - 1 - row, size - 1 - col));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        System.out.println("pattern 10");
        int originalN =n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int ateveryindex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex +" ");
            }
            System.out.println();

        }

    }
}
