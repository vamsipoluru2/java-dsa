public class _01SearchXinSortedArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=20;
        System.out.println("Index:"+binarySearch(arr, target));
        System.out.println("Index:"+binartSearchRec(arr,target,0,arr.length-1));
    }   

    static int binarySearch(int[] arr, int target){ 
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // int mid=(start+end)/2;//start+end) if large value it may exceed the range of int
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
            return mid;
            }
        }
        return -1;//element not found
    }

    static int binartSearchRec(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
            return binartSearchRec(arr,target,start,mid-1);
        }
        else{
            return binartSearchRec(arr,target,mid+1,end);
        }
    }
}
