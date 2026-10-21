package Striver_dsa.day05_sorting;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){

        for(int i=arr.length-1;i>=1;i--){

            boolean swaped=false;// this will check if the array is already sorted or not 
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1])
                    swap( arr,j,j+1);
                    swaped=true;
            }
            if(!swaped) break;
        }

        return arr;

    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

