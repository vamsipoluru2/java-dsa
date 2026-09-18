package Striver_dsa.day05_sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        
        int arr[]={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int arr[],int low,int high){
        if(low<high){
        int Pi=partition(arr,low,high);
        sort(arr,low,Pi-1);
        sort(arr,Pi+1,high);
    }
    }

    static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j)
                swap(arr,i,j);
        }
        swap(arr, i, j);
        return j;


    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
