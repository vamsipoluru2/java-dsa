import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _01LongestConseSeq {
     public static void main(String[] args) {
    /*
     * Given an unsorted array, find the length of the
     * longest sequence of consecutive integers.
     *
     * Example: {100, 4, 200, 1, 3, 2}
     * Longest sequence = {1,2,3,4}
     * Answer = 4
     */
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        int[] arr2 = {100, 4, 200, 1, 3, 2};
        int[] arr3 = {100, 4, 200, 1, 3, 2};
        System.out.println("Brute: " + longestBrute(arr1));
        System.out.println("Better: " + longestBetter(arr2));
        System.out.println("Opti "+ longestOpti(arr3,arr3.length));
    }

    static int longestBrute(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int count = 1;
            // Keep checking current + 1, current + 2...
            while (linearSearch(arr, current + 1)) {
                current++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    static int longestBetter(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        for (int i = 0; i < nums.length; i++) {
            // current number is exactly next consecutive number
            if (nums[i] - 1 == lastSmaller) {
                count++;
                lastSmaller = nums[i];
            }
            // current number is not duplicate and sequence breaks
            else if (nums[i] != lastSmaller) {
                count = 1;
                lastSmaller = nums[i];
            }
            // if nums[i] == lastSmaller,
            // it is duplicate, so do nothing

            longest = Math.max(longest, count);
        }
        return longest;
    }
    //longest opti
    static int longestOpti(int[] nums,int n) {
        if (n == 0) return 0;
        int longest = 1; 

        Set<Integer> st = new HashSet<>();
 
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);//adding into set
        }
         /* Traverse the set to find the longest sequence */
        for (int it : st) {
            if (!st.contains(it - 1)) { // Check if 'it' is a starting number of a sequence
                int cnt = 1; 
                int x = it; 
                while (st.contains(x + 1)) {// Find consecutive numbers in the set
                    x = x + 1; 
                    cnt = cnt + 1; 
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
