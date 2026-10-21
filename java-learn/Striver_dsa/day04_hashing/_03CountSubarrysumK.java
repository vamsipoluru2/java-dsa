public class _03CountSubarrysumK {
        public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int k = 2;
        System.out.println("Count: " + countSubarraysBrute(arr, k));

        System.out.println("Count: " + countSubarrays(arr, k));
    }

    static int countSubarraysBrute(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }


    // count all subarrays with sum ≤ k, then remove all subarrays with sum ≤ k-1.
    static int countSubarrays(int[] arr, int k) {
        return countAtMost(arr, k)- countAtMost(arr, k - 1);
    }
    static int countAtMost(int[] arr, int k) {
        if(k<0){
            return 0;
        }
        int left = 0,right = 0;
        int sum = 0, count = 0;
        while (right < arr.length) {
            sum += arr[right];
            // if sum becomes greater than k,shrink window from left
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
                count += right - left + 1;      
                right++;      
            }
        return count;
    }
}
