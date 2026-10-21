public class _03SearchInPosition {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 21;

        System.out.println("Index: " + searchInposition(arr, target));
    }

    //it searched the nearest number for the target and returns the index of that number
    static int searchInposition(int[] arr, int target) {
          int start=0;
          int end=arr.length-1;
            
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<=arr[mid]){
                end=mid-1; 
            }else {
                start=mid+1;
            }
        }
        return start ;//element not found
    }

}
