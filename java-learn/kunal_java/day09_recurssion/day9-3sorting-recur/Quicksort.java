import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr={5,2,8,9,1,3,7};
        // quickSort(arr, 0, arr.length-1);
        // System.out.println("After sorting:"+ Arrays.toString(arr));
        Arrays.sort(arr);//using dual pivot qucik sort
        System.out.println("After sorting:"+Arrays.toString(arr));
        
    }
    
    static void quickSort(int[] arr, int low, int high){
    if(low>=high){
        return; 
    }
    int start=low;
    int end=high;
    int mid=start+(end-start)/2;
    int pivot=arr[mid];

    while(start<=end){
        while(arr[start]<pivot){
            start++;
        }
        while(arr[end]>pivot){
            end--;
        }
        if(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--; 
        }
    
    
    }
    quickSort(arr, low, end);
    quickSort(arr, start, high);


    }
}
