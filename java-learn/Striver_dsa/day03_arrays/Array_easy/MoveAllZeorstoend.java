import java.util.Arrays;

public class MoveAllZeorstoend {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        //brute force
        System.out.println(Arrays.toString(moveZeros(arr,arr.length)));
        //optimalsol

        
    }

    //bruteforrc
    static int[] moveZeros(int[] arr,int n){
        int[] temp=new int[n];
        
        int j = 0;
        // Put all non-zero elements at the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }

        int nz=temp.length;
        // Copy temp back to arr
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }

    //optimal sol two pointer
    static int[] movezerosoptimmal(int[] arr,int n){

        int j=-1;
        
        //finding the first zero element
        for(int i=0;i<n;i++){
            if(arr[i]==0){
            j=i;//j storing i index of zero ele
            break;
        }
    }
        if(j==-1){
            return arr;
        }

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                 swap(arr, i, j);
                j++;//only incrementing j when we swap, so that j always points to the next zero element
            }
        }
        return arr;
    }

          // Swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

    
