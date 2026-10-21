import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverLapInter {
        public static void main(String[] args) {
             int[][] arr = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        List<int[]> ans = mergeOverlappingIntervals(arr);
        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }

    static List<int[]> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        // Sort based on starting value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            // If current interval is already covered
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }
            // Merge overlapping intervals
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        return ans;
    }
}
