public class _08MInRBS {
    //   Rotated binaary search finding min with and without duplicates 

    public static void main(String[] args) {
        
    
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Minimum: " + findMin(arr));

    }
    static int findMin(int [] arr){
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high){
            int mid=low+(high-low)/2;
            // for duplicate 
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                ans=Math.min(ans,arr[low]);
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[high]){//entire array is sorted
                ans=Math.min(ans,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){//left is sorted
                ans=Math.min(ans,arr[low]);
                low=mid+1;//eliminate sorted part and check in right part
            }else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;//eliminate sorted part and chcek in left part
            }
        }
        return ans;
    }
}
