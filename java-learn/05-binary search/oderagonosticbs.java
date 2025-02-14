// package day4 binary_kunal;/

public class oderagonosticbs {
    public static void main(String[] args) {
        // int[] arr1={2,4,6,9,11,12,14,20,36,48};//if asecending in while loop below
        int[] arr={99,80,75,22,11,10,5,2,-3};//else decending
        int target=22;
        System.out.println(OrderAgonstBS(arr, target));
    }

    static int OrderAgonstBS(int[] arr, int target){ 
        int start=0;
        int end=arr.length-1;

        //find weather the array is sorted in ascending otr decinding
       boolean isAsc=arr[start]<arr[end]; 




        while(start<=end){
            // int mid=(start+end)/2;//start+end) if large value it may exceed the range of int
            int mid=start+(end-start)/2;

            if(arr[mid]==target) {
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;//element not found

    }

}
