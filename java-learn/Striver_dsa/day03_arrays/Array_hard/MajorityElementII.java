import java.util.*;

public class MajorityElementII {

    /*
     * Find all elements that appear more than floor(n/3) times.
     * There can be at most 2 such elements.
     */

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};

        System.out.println("Brute: " + majorityBrute(arr,arr.length));
        System.out.println("Hashing: " + majorityHashing(arr));
        System.out.println("Optimal: " + majorityElementOpti(arr));
    }


    static List<Integer> majorityBrute(int[] arr,int n) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // avoid checking same answer again
            if (ans.contains(arr[i])) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 3) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static List<Integer> majorityHashing(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // get the frequency of the current element
            if (map.get(arr[i]) == mini) {
                ans.add(arr[i]);
            }
            // at most 2 majority elements are possible
            if (ans.size() == 2)break;
        }

        Collections.sort(ans);

        return ans;
    }

    static List<Integer> majorityElementOpti(int[] arr) {

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Find 2 possible candidates
        for (int num : arr) {

            if (num == candidate1) {
                count1++;
            }

            else if (num == candidate2) {
                count2++;
            }

            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }

            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }

            else {
                count1--;
                count2--;
            }
        }

        // Manual verification / second pass
        count1 = 0;
        count2 = 0;

        for (int num : arr) {

            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > arr.length / 3) {
            ans.add(candidate1);
        }

        if (count2 > arr.length / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}
