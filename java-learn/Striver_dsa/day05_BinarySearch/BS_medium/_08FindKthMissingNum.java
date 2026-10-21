public class _08FindKthMissingNum {
    
    
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println("Kth Missing Number: " + findMissing(arr, k));
        System.out.println("Kth Missing Number: " + findMissingBS(arr, k));
    }

    static int findMissing(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else break;
            }
            return k;
    }

    static int findMissingBS(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }else high=mid-1;
        }
        return high+1+k;

    }
}
