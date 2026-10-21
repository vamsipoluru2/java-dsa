public class _05FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8, 8, 10};
        int target = 4;

        int first = firstOccurrence(arr, target);

        if (first == -1) {
            System.out.println("Target not found");
            return;
        }

        int last = lastOccurrence(arr, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }

    static int firstOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}