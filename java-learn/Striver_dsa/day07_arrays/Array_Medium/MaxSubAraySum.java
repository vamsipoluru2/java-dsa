public class MaxSubAraySum {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans = maxSubArray(nums, nums.length);

        System.out.println("Maximum Subarray Sum: " + ans);

        int ansBetter = maxSubArrayBetter(nums, nums.length);
        System.out.println("Maximum Subarray Sum (Better): " + ansBetter);

        int ansopti = maxSubArrayOpti(nums, nums.length);

        System.out.println("Maximum Subarray Sum (opti): " + ansopti);


        // Separate input for printing the maximum subarray
        int[] numsSubArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        printMaxSubArray(numsSubArray, numsSubArray.length);

    }

    static int maxSubArray(int[] nums, int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int CurrSum = 0;//Initializing the current sum to 0 for each subarray due to the outer loop

                for (int k = i; k < j; k++) {
                    CurrSum += nums[k];//Calculating the sum of subarray from index i to j
                    maxSum = Math.max(CurrSum, maxSum);//updating the max sum if the curr sum is greater
                }
            }
        }
        return maxSum;
    }

    static int maxSubArrayBetter(int[] nums, int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int CurrSum = 0;
            for (int j = i; j < n; j++) {
                CurrSum += nums[j];//Calculating the sum of subarray from index i to j
                maxSum = Math.max(CurrSum, maxSum);//updating the max sum if the curr sum is greater
            }
        }
        return maxSum;
    }

    static int maxSubArrayOpti(int[] nums, int n) {
        long sum = 0;
        long maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxi = Math.max(maxi, sum);

            if (sum < 0)
                sum = 0;//sont carry negative sum to future
        }

        return (int) maxi;
    }

    // Printing the maximum subarray using Kadane's Algorithm
    static void printMaxSubArray(int[] nums, int n) {

        long sum = 0;
        long maxi = Long.MIN_VALUE;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < n; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;//sont carry negative sum to future
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxi);

        System.out.print("Maximum Subarray: [");

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i]);

            if (i < ansEnd) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}