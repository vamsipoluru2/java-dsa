public class SpiralMatrix {
     public static void main(String[] args) {

    int[][] arr = {
        {1,  2,  3,  4,  5,  6},
        {20, 21, 22, 23, 24, 7},
        {19, 32, 33, 34, 25, 8},
        {18, 31, 36, 35, 26, 9},
        {17, 30, 29, 28, 27, 10},
        {16, 15, 14, 13, 12, 11}
    };

        int top = 0;
        int left = 0;
        int right = arr[0].length - 1;
        int bottom = arr.length - 1;


        spiralPrint(arr, top, left,right,bottom);
    }
    static void spiralPrint(int[][] arr,int top,int left,int right,int bottom){
       
        while(top<=bottom && left<=right){
            // Left → Right
            for(int i=left;i<=right;i++){
               System.out.print(arr[top][i]+" ");
            }
            top++;
            //Top->bottom
            for(int j=top;j<=bottom;j++){
                System.out.print(arr[j][right]+" ");
            }
            right--;
            if(top<= bottom){
                // right->left
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }

            if(left<=right){
                //bottom->top
                for(int j=bottom;j>=top;j--){
                    System.out.print(arr[j][left]+" ");
                }
                left++;
            }
        }
    }
}
