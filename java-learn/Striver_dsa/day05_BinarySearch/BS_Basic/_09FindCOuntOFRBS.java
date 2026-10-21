public class _09FindCountOfRBS {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Rotation Count: " + findRotationCount(arr));
    }

    static int findRotationCount(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // duplicate ambiguity
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                low++;
                high--;
                continue;
            }

            // current range already sorted
            if (arr[low] <= arr[high]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                break;
            }

            // left half sorted
            if (arr[low] <= arr[mid]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                low = mid + 1;
            }

            // right half sorted
            else {

                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }

                high = mid - 1;
            }
        }

        return index;
    }
}