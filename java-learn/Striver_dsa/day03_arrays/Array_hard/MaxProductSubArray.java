public class MaxProductSubArray {
    // Que:Given an integer array nums. Find the subarray with the largest product, and return the product of the elements present in that subarray.   
    // A subarray is a contiguous non-empty sequence of elements within an array.
    public static void main(String[] args) {
        int[] evenNeg = {-2, 3, -4};
        int[] oddNeg = {-2, 3, -4, -1};
        int[] withZero = {-2, 0, -1, 4, -3};

        System.out.println("Brute: " + maxProductBrute(evenNeg));
        System.out.println("Better: " + maxProductBetter(oddNeg));
        System.out.println("Optimal: " + maxProductOpti(withZero));
    }
      static int maxProductBrute(int[] nums) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= nums[k];
                }
                result = Math.max(result, prod);
            }
        }
        return result;
    }

    static int maxProductBetter(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int p = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                result = Math.max(result, p);
                p *= nums[j];
            }
            result = Math.max(result, p);
        }
        return result;
    }

    static int maxProductOpti(int[] nums) {
        int n = nums.length; 
        int ans = Integer.MIN_VALUE; // to store the answer
        
        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            /* Resetting the prefix and suffix multiplication if they turn out to be zero */
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}