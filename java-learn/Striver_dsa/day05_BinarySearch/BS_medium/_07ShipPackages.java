import java.util.*;

public class _07ShipPackages {

    /*
     * You are given an array weights where weights[i]
     * represents the weight of the ith package.
     *
     * Packages must be shipped in the given order.
     *
     * Find the minimum ship capacity needed to ship
     * all packages within the given number of days.
     *
     * Example:
     *
     * weights = {1,2,3,4,5,6,7,8,9,10}
     * days = 5
     *
     * Answer = 15
     */

    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(
            "Brute Force Answer: " +
            shipWithinDaysBrute(weights, days)
        );

        System.out.println(
            "Binary Search Answer: " +
            shipWithinDaysBS(weights, days)
        );
    }


    static int shipWithinDaysBrute(int[] weights, int days) {

        int low = findMax(weights);
        int high = findSum(weights);

        // try every possible capacity
        for (int capacity = low; capacity <= high; capacity++) {

            if (canShip(weights, days, capacity)) {
                return capacity;
            }
        }

        return high;
    }


    static int shipWithinDaysBS(int[] weights, int days) {
        int low = findMax(weights);
        int high = findSum(weights);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                ans = mid;
                // capacity works, try smaller
                high = mid - 1;
            } else {
                // capacity too small
                low = mid + 1;
            }
        }
        return ans;
    }


    // Find maximum package weight
    static int findMax(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int w : weights) {
            max = Math.max(max, w);
        }
        return max;
    }
    // Find sum of all package weights
    static int findSum(int[] weights) {
        int sum = 0;
        for (int w : weights) {
            sum += w;
        }
        return sum;
    }

     static boolean canShip(int[] weights, int days, int capacity) {
        int requiredDays = 1;
        int currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                // start a new day
                requiredDays++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return requiredDays <= days;
    }
}