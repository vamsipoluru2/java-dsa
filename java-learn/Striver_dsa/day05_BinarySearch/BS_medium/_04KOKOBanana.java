public class _04KOKOBanana {

    public static void main(String[] args) {

        int[] nums = {7, 15, 6, 3};
        int h = 8;


        System.out.println("Linear Search Answer: " + minimumRateLinear(nums, h));
        System.out.println("Binary Search Answer: " + minimumRateBinarySearch(nums, h));
    }

    // ---------------- LINEAR APPROACH ----------------

    static int minimumRateLinear(int[] nums, int h) {

        int maxi = findMax(nums);

        for (int rate = 1; rate <= maxi; rate++) {

            long totalH = calculateTotalHours(nums, rate);

            if (totalH <= h) {
                return rate;
            }
        }

        return maxi;
    }

    // ---------------- BINARY SEARCH APPROACH ----------------

    static int minimumRateBinarySearch(int[] nums, int h) {

        int low = 1;
        int high = findMax(nums);//o(n) to find max element

        while (low <= high) {//o(logn) to find min rate 

            int mid = low + (high - low) / 2;

            long totalH = calculateTotalHours(nums, mid);//o(n) to calculate total hours

            if (totalH <= h) {
                // valid rate, try smaller
                high = mid - 1;
            } else {
                // rate too small
                low = mid + 1;
            }
        }

        return low;
    }

    // Find maximum element
    static int findMax(int[] nums) {

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        return maxi;
    }

    // Calculate total hours for a given rate
    static long calculateTotalHours(int[] nums, int hourly) {

        long totalH = 0;

        for (int i = 0; i < nums.length; i++) {
            totalH += Math.ceil((double) nums[i] / hourly);
        }

        return totalH;
    }
}