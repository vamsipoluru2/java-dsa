package Striver_dsa.day05_sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(Sort(arr)));
   
        
    }

    static int[] Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;//by the end of this loop we will get the index of the minimum element in the array
            }
            
            }
            swap(arr,i,min);
        }
        return arr;
    }
   static void swap(int[] arr, int i, int min) {
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
}
}
