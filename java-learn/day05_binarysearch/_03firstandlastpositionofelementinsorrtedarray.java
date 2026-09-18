import java.util.Arrays;

public class _03firstandlastpositionofelementinsorrtedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,7,8,9,10};
        int target=7;

        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int search(int[] nums, int target, boolean firststartIndex){
        
    int ans=-1;
        
        //check for first occ

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            // int mid=(start+end)/2;//start+end) if large value it may exceed the range of int
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                //potential answer found
            ans=mid;
            if(firststartIndex==true){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

               }
            }
            return ans;
        }
         
    }

