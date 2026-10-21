// Rearrange Array Elements by Sign

// Given an integer array nums containing an equal number of positive and negative integers, rearrange the elements so that:

// Positive and negative elements alternate.
// The first element is positive.
// The relative order of positive elements remains unchanged.
// The relative order of negative elements remains unchanged.

import java.util.Arrays;

public class RearrrangeEleBySign {
    public static void main(String[] args) {
    int[] nums ={3,2,-5,1,-4,-3};
    int[] nums2 ={6,3,-8,9,-1,-7};

    System.out.println(Arrays.toString(Elebysignbrute(nums,nums.length)));
    System.out.println(Arrays.toString(Elebysignopti(nums2,nums.length)));

    }

    static int[] Elebysignbrute(int[] nums,int n){
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p = 0;
        int ne= 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[p++]=nums[i];
            }
            else{
                neg[ne++]=nums[i];
            }
        }

        for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
    }
    //o[n]
        static int[] Elebysignopti(int[] nums,int n){
        int[] ans=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos=pos+2;

            }
            else{
               ans[neg]=nums[i];
               neg=neg+2;
            }
        }
        return ans;
    }

    
    //2nd varity if pos!=neg
   static int[] Elebysignbrute2(int[] nums, int n) {

    int[] pos = new int[n];
    int[] neg = new int[n];

    int p = 0;
    int ne = 0;

    // Separate positive and negative elements
    for (int i = 0; i < n; i++) {

        if (nums[i] > 0) {
            pos[p++] = nums[i];
        }
        else {
            neg[ne++] = nums[i];
        }
    }

    // If positives are more
    if (p > ne) {

        // Alternate while negatives are available
        for (int i = 0; i < ne; i++) {
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }

        // Put remaining positives
        int index = 2 * ne;

        for (int i = ne; i < p; i++) {
            nums[index++] = pos[i];
        }
    }

    // If negatives are more
    else {

        // Alternate while positives are available
        for (int i = 0; i < p; i++) {
            nums[2 * i] = pos[i];
            nums[2 * i + 1] = neg[i];
        }

        // Put remaining negatives
        int index = 2 * p;

        for (int i = p; i < ne; i++) {
            nums[index++] = neg[i];
        }
    }

    return nums;
}


}
