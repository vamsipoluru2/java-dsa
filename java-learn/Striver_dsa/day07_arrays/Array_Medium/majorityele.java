// Given an integer numsay nums of size n, return the majority element of the numsay.

// The majority element of an numsay is an element that appears more than n/2 times in the numsay. The numsay is guaranteed to have a majority element.

import java.util.HashMap;
import java.util.Map;

public class majorityele {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 5, 5, 5, 5};
        System.out.println(majorityElement(nums,nums.length));
        System.out.println(majorityElebetter(nums,nums.length));
        System.out.println(majorityElementopt(nums,nums.length));


    }
    static int majorityElement(int[] nums,int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }     
            }
            if(count>n/2){
                    return nums[i];
                }
        }
        return -1;
    }

    static int majorityElebetter(int[] nums, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int i = 0; i < n; i++) {

            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        // Find majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    //moore voting algo
     static int majorityElementopt(int[] nums,int n) {
        int ele=0;
        int cnt=0;

        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }
            if(nums[i]==ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        //This part is the verification step of the Boyer-Moore algorithm. Its purpose is to answer:
         // Verify candidate
        int cnt1 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                cnt1++;
            }
        }

        // Check whether candidate is actually majority
        if (cnt1 > n / 2) {
            return ele;
        }

        return -1;
     }
}