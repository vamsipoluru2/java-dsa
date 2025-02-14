// 410. Split Array Largest Sum
// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

// Return the minimized largest sum of the split.

// A subarray is a contiguous part of the array.

// Example 1:

// Input: nums = [7,2,5,10,8], k = 2
// Output: 18
// Explanation: There are four ways to split nums into two subarrays.
// The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

public class split_array {
    // https://leetcode.com/problems/split-array-largest-sum/description/
    public static void main(String[] args) {
       int[] nums = {7,2,5,10,8};
       int  k = 2;
       System.out.println(splitArray(nums, k));
       //[7,2,5,10],[8]=24// THESE VALUE IS LARGEST IN THEIR SUB ARRAY
       //[7,2,5],[10,8]=18
       //[7,2],[5,10,8]=23
       //[7],[2,5,10,8]=25//SMALLET SUM IS 18
    }
    
    static int splitArray(int[] nums,int m){
        int start = 0;
        int end = 0;

        for(int j=0;j<nums.length;j++){
            start=Math.max(start,nums[j]);//in the end it will contain max element in the arraay
            end += nums[j];
        }
        if (m == 1) return (int) end;
        while(start<end){
            int mid = start + (end-start)/2;
            //calculate how manu pices you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}
