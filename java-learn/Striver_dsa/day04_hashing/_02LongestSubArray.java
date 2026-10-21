import java.util.HashMap;

public class _02LongestSubArray {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 6;
        System.out.println("Longest Length: " + longestSubarray(arr, k));
    }

    static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // subarray from 0 to i
            if (sum == k) {
                maxLen = i + 1;
            }
            // need previous prefix sum = sum - k
            int remaining = sum - k;
            if (map.containsKey(remaining)) {
                int len = i - map.get(remaining);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) {//for handling zeros
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    //twopointer
    static int longestSubarrayopti(int[] arr, int k) {
        int left = 0,right = 0;
        int sum = 0, maxLen = 0;
        while (right < arr.length) {
            sum += arr[right];
            // if sum becomes greater than k,shrink window from left
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            // valid subarray found
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}
