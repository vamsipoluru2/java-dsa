// package Striver_dsa.day09_BinarySearch.BS_Basic;

public class _02UpperLowerBound {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 20;
        int target2= 20;

        System.out.println("Index: " + LowerBound(arr, target));
                System.out.println("Index: " + UpperBound(arr, target2));
         
    }

    static int LowerBound(int[] arr, int target) {
          int start=0;
          int end=arr.length-1;
            
        while(start<=end){
            // int mid=(start+end)/2;//start+end) if large value it may exceed the range of int
            int mid=start+(end-start)/2;
            if(target<=arr[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return start; // First index with value >= target; arr.length if none exists.
    }

        static int UpperBound(int[] arr, int target) {
         int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
        return start; // First index with value > target; arr.length if none exists.
    }
}
