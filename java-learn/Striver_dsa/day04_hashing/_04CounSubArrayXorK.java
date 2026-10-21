import java.util.HashMap;

public class _04CounSubArrayXorK{
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;
        System.out.println("Count: " + countSubarraysBrute(arr, k));
    }

    static int countSubarraysBrute(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int XOR = 0;
            for (int j = i; j < arr.length; j++) {
                XOR ^= arr[j];
                if (XOR == k) {
                    count++;
                }
            }
        }
        return count;
    }

     static int countSubarraysXorK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;
        // prefix XOR 0 occurred once before array starts
        map.put(0, 1);
        for (int num : arr) {
            xor ^= num;
            // required previous prefix XOR
            int remaining = xor ^ k;
            if (map.containsKey(remaining)) {
                count += map.get(remaining);
            }
            // store frequency of current prefix XOR
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}