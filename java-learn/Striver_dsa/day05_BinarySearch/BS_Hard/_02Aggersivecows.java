import java.util.Arrays;

public class _02Aggersivecows {
    /*
 * Given an array of integers representing the positions of cows in a field,
 * and an integer k representing the number of cows to be placed,
 * find the largest minimum distance between any two cows.
 * 
 * The goal is to place k cows in such a way that the minimum distance
 * between any two cows is maximized.
 */

    public static void main(String[] args) {
        int[] positions = {1, 2, 4, 8, 9};
        int k = 3;

        //LINEAR SOLUTION
        System.out.println("Linear Answer: " + largestMinDistanceLinear(positions, k));
        //BINARY SEARCH SOLUTION
        System.out.println("Largest Minimum Distance: " + largestMinDistance(positions, k));
    }

    static int aggressiveCowsLinear(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int maxDistance =stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        for (int distance = 1;distance <= maxDistance;distance++) {
            if (canPlace(stalls, cows, distance)) {
                ans = distance;
            } else {
                // if this distance is not possible,// bigger distances will also not be possible
                break;
            }
        }
        return ans;
    }

    static int aggressiveCowsBS(int[] stalls, int cows){
        Arrays.sort(stalls);
        int low = 1;
        int high =stalls[stalls.length - 1] - stalls[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(stalls, cows, mid)) {
                // mid is possible,try a bigger minimum distance
                low = mid + 1;
            } else {// mid is too large
                high = mid - 1;
            }
        }

        return high;
    }

    static boolean canPlace(int[] stalls, int cows, int distance) {
        int cowCount = 1;
        // place first cow at first stall
        int lastCowPosition = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCowPosition >= distance) {
                cowCount++;
                lastCowPosition = stalls[i];
                if (cowCount >= cows) {
                    return true;
                }
            }
        }
        return false;
    }
}
