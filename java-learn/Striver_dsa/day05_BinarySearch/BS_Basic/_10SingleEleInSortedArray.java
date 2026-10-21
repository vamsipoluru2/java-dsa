public class _10SingleEleInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        System.out.println("Single Element: " + singleElement(arr));
    }

    static int singleElement(int[] arr) {

        int n = arr.length;

        // edge cases
        if (n == 1) {
            return arr[0];
        }

        if (arr[0] != arr[1]) {
            return arr[0];
        }

        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // single element found
            if (arr[mid] != arr[mid - 1] &&
                arr[mid] != arr[mid + 1]) {

                return arr[mid];
            }

            // we are on LEFT side of single element
            if (
                (mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
                (mid % 2 == 1 && arr[mid] == arr[mid - 1])
            ) {

                low = mid + 1;
            }

            // we are on RIGHT side of single element
            else {

                high = mid - 1;
            }
        }

        return -1;
    }
} 
