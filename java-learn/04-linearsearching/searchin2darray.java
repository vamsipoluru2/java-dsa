import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        // int[][] arr1={{23,4,1},{18,12,9,3},{78,99,34,56},{18,12}};
        int[][] arr = {{-15, -42, -7},{-88, -23, -11, -19},{-67, -3, -56, -99},{-45, -78}};
        int target = 34;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max element in array: " + max(arr));
    }

    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){//for searching row wise//travesing in 2d array 
                if(arr[i][j]==target){
                    return new int[]{i,j};//returning in array
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;//UNIVERSAL LOW VALUE -2,147,483,648
        for (int[] element : arr) {
            for (int element2 : element) {//for searching row wise//travesing in 2d array 
                if(element2>max){
                    max=element2;//returning in array
                }
            }
        }
        return max;
    }
}
