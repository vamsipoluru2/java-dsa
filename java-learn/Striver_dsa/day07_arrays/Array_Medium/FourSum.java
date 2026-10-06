import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public static void main(String[] args) {
         int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        //  for target is 0; 1,0,-1,0,2,-2

        // Brute
        List<List<Integer>> ans1 = FourSumBrute(nums, nums.length,8);
        System.out.println("Brute: " + ans1);

         // Better - Hashing
        List<List<Integer>> ans2 = FourSumBetter(nums, nums.length,8);
        System.out.println("Better: " + ans2);

         // Optimal - Sorting + Two Pointer
        List<List<Integer>> ans3 = fourSumOptimal(nums, nums.length,8);
        System.out.println("Optimal: " + ans3);
        
    }
     static List<List<Integer>> FourSumBrute(int[] nums, int n,int target) {

        Set<List<Integer>> quadrupletSet = new HashSet<>();

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                for(int k = j + 1; k < n; k++) {

                    for(int l = k + 1; l < n; l++){
                        
                        long sum=nums[i] + nums[j];
                        sum+=nums[k];
                        sum+=nums[l];
                        if(sum==target){

                            List<Integer> temp = new ArrayList<>();

                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);


                            Collections.sort(temp);

                            quadrupletSet.add(temp);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(quadrupletSet);
    }
    // Brute hashing 
    static List<List<Integer>> FourSumBetter(int[] nums, int n, long target) {

    Set<List<Integer>> fourSet = new HashSet<>();


    for (int i = 0; i < n; i++) {

        for (int j = i + 1; j < n; j++) {

            HashSet<Long> hashset = new HashSet<>();

            for (int k = j + 1; k < n; k++) {

                long fourth = target- (long) nums[i]- (long) nums[j]- (long) nums[k];

                if (hashset.contains(fourth)) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add((int) fourth);

                    Collections.sort(temp);

                    fourSet.add(temp);
                }

                hashset.add((long) nums[k]);// Store the current nums[k] so it can be used as the 4th element in the next iterations.
            }
        }
    }

    return new ArrayList<>(fourSet);
}   
    static List<List<Integer>> fourSumOptimal(int[] nums, int n, long target) {

    List<List<Integer>> ans = new ArrayList<>();

    // Step 1: Sort
    Arrays.sort(nums);

    for (int i = 0; i < n; i++) {

        // Skip duplicate first elements
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        for (int j = i + 1; j < n; j++) {

            // Skip duplicate second elements
            if (j != i + 1 && nums[j] == nums[j - 1]) {
                continue;
            }

            int k = j + 1;
            int l = n - 1;

            while (k < l) {

                long sum = (long) nums[i]+ nums[j]+ nums[k]+ nums[l];

                if (sum == target) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);

                    ans.add(temp);

                    k++;
                    l--;

                    // Skip duplicate third elements
                    while (k < l && nums[k] == nums[k - 1]) {
                        k++;
                    }

                    // Skip duplicate fourth elements
                    while (k < l && nums[l] == nums[l + 1]) {
                        l--;
                    }

                } else if (sum < target) {
                    k++;
                } else {
                    l--;
                }
            }
        }
    }

    return ans;
}
}