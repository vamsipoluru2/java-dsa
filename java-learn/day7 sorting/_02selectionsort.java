// package day5_1 sortingkunal;
import java.util.Arrays;

public class _02selectionsort {
    public static void main(String[] args) {
        int[] arr = {4,5, 3, 2, 1};
        selectionsortt(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
        
    }

    static void selectionsortt(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            // FIND max item in the remaining array and basic.swap with correct index
            int last=arr.length-i-1;//this will make last element fixed while it was in correct place
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);// the max index in above its will get swapped with last index
        }
    }

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


     static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
