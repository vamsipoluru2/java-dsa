import java.util.Arrays;
public class bubblesort_recur {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr,int row, int col){
        if(row ==0){
            return;
        }
        if(col<row){
            if(arr[col] < arr[col+1]){
                int temp =arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;

            }
            bubble(arr,row,col+1);
            //excuite when fuhnction is exiting from the stack
             
            }else{
                bubble(arr,row-1, 0);//next row traves

            }
        }

        static void selection(int[] arr,int row, int col,int max){
            if(row == 0){//row is coming from the arraylast 
                return;
            }
            if(col<row){
                if(arr[col]> arr[max]){
                    selection(arr,row,col+1,col);
                }else{
                    selection(arr,row,col+1,max);
                }
            }
            else{
                int temp=arr[max];
                arr[max]=arr[row-1];//row-1 is last index
                arr[row-1]=temp;
                selection(arr,row-1,0,0);
                }
            }
    
}
