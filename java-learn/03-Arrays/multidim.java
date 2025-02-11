import java.util.Scanner;
import java.util.Arrays;


public class multidim {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] =in.nextInt();
            }
        }

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.print("\n");

        }
        System.out.print("\n");

       

    int[][] arr1={{1,2,3},{4,5},{6,7,8,9}};

    for(int i=0; i<arr1.length; i++){
        for(int j=0; j<arr1[i].length; j++){ //arr1[i].length is now many elements in that row 
            System.out.print(arr1[i][j]);
        }
        System.out.print("\n");
    }


    //intstead of two for loops on with enhamnce for loop
    for(int[] a:arr1){
        System.out.println(Arrays.toString(a));
    }
    
    in.close(); 
    }
   

}
