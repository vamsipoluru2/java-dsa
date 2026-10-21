public class _06SmallestDivisorwithinthreshold {
/*  Problem:Find the smallest divisor such that:
     * ceil(nums[0] / divisor)
     * + ceil(nums[1] / divisor)
     * + ...
     * is less than or equal to threshold.
     */

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int th = 6;

        System.out.println("Brute Answer: " + smallestDivisorBrute(nums, th));
        System.out.println("Binary Search Answer: " + smallestDivisorBS(nums, th));
    }

    static int smallestDivisorBrute(int[] nums, int th) {

        int max = findMax(nums);

        for (int divisor = 1; divisor <= max; divisor++) {

            if (possible(nums, divisor) <= th) {
                return divisor;
            }
        }

        return -1;
    }

    static int smallestDivisorBS(int[] nums, int th) {
        if(nums.length>th) return -1;

        int low = 1;
        int high = findMax(nums);

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(nums, mid) <= th) {

                ans = mid;

                // valid divisor, try smaller
                high = mid - 1;

            } else {

                // divisor too small
                low = mid + 1;
            }
        }

        return ans;
    }


    // Calculate sum after dividing every element by divisor
    static int possible(int[] arr, int divisor) {

        int sum = 0;

        for (int i : arr) {

            sum += Math.ceil((double) i / divisor);
        }

        return sum;
    }


    // Find maximum element
    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }
}