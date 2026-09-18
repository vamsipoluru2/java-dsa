//Bubble sort is a simple algorithm that organizes a list of elements in order.
//It's a comparison sort that compares adjacent elements and swaps them if they're out of order
//This process is repeated until the list is sorted

import java.util.Arrays;
public class _01bubblesort {
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
            //for each step max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++){//arr.length-1 due to after sorting we are leaving last element as it was sorted
                //basic.swap if the item is smaller than the previous item
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true; //indicates that a basic.swap has occurred
                }
            }
            //if no two elements were swapped by inner loop, then the array is sorted
            if(!swapped){break;}
        }
    }
}
 