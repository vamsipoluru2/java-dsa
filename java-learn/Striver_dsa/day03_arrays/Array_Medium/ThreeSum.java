import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Brute
        List<List<Integer>> ans1 = threeSumBrute(nums, nums.length);
        System.out.println("Brute: " + ans1);

        // Better - Hashing
        List<List<Integer>> ans2 = threeSumBetter(nums, nums.length);
        System.out.println("Better: " + ans2);

        // Optimal - Sorting + Two Pointer
        List<List<Integer>> ans3 = threeSumOptimal(nums, nums.length);
        System.out.println("Optimal: " + ans3);
    }


    // ==========================================
    // BRUTE FORCE
    // TC: O(n^3)
    // SC: O(number of unique triplets)
    // ==========================================

    static List<List<Integer>> threeSumBrute(int[] nums, int n) {

        Set<List<Integer>> tripletSet = new HashSet<>();

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                for(int k = j + 1; k < n; k++) {

                    if(nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        Collections.sort(temp);

                        tripletSet.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(tripletSet);
    }


    // ==========================================
    // BETTER - HASHING
    // Average TC: O(n^2)
    // SC: O(n)
    // ==========================================

    static List<List<Integer>> threeSumBetter(int[] nums, int n) {

        Set<List<Integer>> tripletSet = new HashSet<>();

        for(int i = 0; i < n; i++) {

            HashSet<Integer> hashset = new HashSet<>();

            for(int j = i + 1; j < n; j++) {

                int third = -(nums[i] + nums[j]);

                if(hashset.contains(third)) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    Collections.sort(temp);

                    tripletSet.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        return new ArrayList<>(tripletSet);
    }


    // ==========================================
    // OPTIMAL - SORTING + TWO POINTER
    // TC: O(n^2)
    // SC: O(1) auxiliary space
    // ==========================================

    static List<List<Integer>> threeSumOptimal(int[] nums, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort
        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {

            // Skip duplicate first elements
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            // Two pointers
            while(j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0) {
                    j++;
                }
                else if(sum > 0) {
                    k--;
                }
                else {

                    // Found triplet
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);

                    j++;
                    k--;

                    // Skip duplicate j values
                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k values
                    while(j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }
}