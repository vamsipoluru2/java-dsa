public class MaxProductSubArray {
    public static void main(String[] args) {
        
    }
      public int maxProduct(int[] nums) {
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

    public int maxProductBetter(int[] nums) {
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

    public int maxProductOpti(int[] nums) {
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