public class findpositionofelementissorrtedofinfinitenumbers {
    public static void main(String[] args) {
        //start with box of size 2
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(findrange(arr,target));
    }

    static int findrange(int[] arr, int target){
        //first find range
        //find start with a box of size 2
        int start=0;
        int end=1;
        // condition check for target to lie in the range
        while (target>arr[end]){
            int newStart=end+1;//in order to use old start we are taking new start before and updating
           
            //double the box value
            //end=previous end+size of box*2
            end=end+(end-start+1)*2;//in order to use old start we are taking new start before and updating
            start=newStart;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target,int start,int end){ 
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
}
