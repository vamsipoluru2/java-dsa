public class _05RoseGarden {

    /*
     * Problem Statement:
     *
     * You are given an array bloomDay where:
     * bloomDay[i] = the day on which the ith flower blooms.
     *
     * You need to make:
     * m bouquets
     *
     * Each bouquet needs:
     * k adjacent flowers
     *
     * Return the minimum number of days required to make
     * m bouquets.
     *
     * If it is impossible to make m bouquets,
     * return -1.
     *
     * Example:
     * bloomDay = {7, 7, 7, 7, 13, 11, 12, 7}
     * m = 2
     * k = 3
     *
     * Answer = 12
     */

    public static void main(String[] args) {

        int[] bloomDay = {7, 7, 7, 7, 13, 11, 12, 7};

        int m = 2; // number of bouquets
        int k = 3; // adjacent flowers required per bouquet

        System.out.println(
            "Linear Answer: " + minDaysLinear(bloomDay, m, k)
        );

        System.out.println(
            "Binary Search Answer: " + minDaysBS(bloomDay, m, k)
        );
    }
    static int minDaysLinear(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // not enough flowers
        if ((long) m * k > n) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        // try every possible day
        for (int day = min; day <= max; day++) {

            if (possible(bloomDay, day, m, k)) {
                return day;
            }
        }

        return -1;
    } 

    static int minDaysBS(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // impossible case
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {

                // mid works, try fewer days
                high = mid - 1;

            } else {

                // mid is too early
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean possible(int[] bloomDay, int day, int m, int k) {

        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            // flower has bloomed
            if (bloomDay[i] <= day) {
                count++;
            } else {// sequence of adjacent flowers breaks
                bouquets += count / k;
                count = 0;
            }
        }// handle flowers at the end
        bouquets += count / k;
        return bouquets >= m;
    }

}
