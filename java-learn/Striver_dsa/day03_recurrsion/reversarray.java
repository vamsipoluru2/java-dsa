package Striver_dsa.day03_recurrsion;

import java.util.Arrays;

public class reversarray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(f(arr,0,arr.length-1)));
        System.out.println(Arrays.toString(f(arr,0)));
      
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] f(int arr[],int start,int end){
        if(start>=end){
            return arr;
        }
        swap(arr,start,end);
        return f(arr,start+1,end-1);
        
    }

    static int[] f(int arr[],int start){
        if(start>=arr.length/2){
            return arr;
        }
        swap(arr,start,arr.length-start-1);
        return f(arr,start+1);
    }
    
}
