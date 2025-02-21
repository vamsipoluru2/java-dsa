import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr={-3,-4,-58,0,2,1};
        // int[] arr1={1,2,3,4,5};
        bubblesortt(arr);// if return type is void
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesortt(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true; //indicates that a swap has occurred
                }
            }
            //if no two elements were swapped by inner loop, then the array is sorted
            if(!swapped){break;}
        }
    }
}
 