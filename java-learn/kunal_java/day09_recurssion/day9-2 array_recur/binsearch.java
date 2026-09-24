public class binsearch{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,55,66,78};
        int target = 55;
        System.out.print(binarySearch(arr,0,arr.length-1,target));
        
    }

    static int binarySearch(int arr[], int s, int e, int target) {
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2; //for large vale of n, we can use this formula to find mid
        if(arr[m] == target){
            return m;
        }
        if( target < arr[m]){
            return binarySearch(arr, s, m-1, target);
        }
        return binarySearch(arr, m+1, e, target);
    }
}
