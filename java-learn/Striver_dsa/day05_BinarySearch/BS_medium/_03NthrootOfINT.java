public class _03NthrootOfINT {
    public static void main(String[] args) {

        int n = 3;
        int m = 28;

        System.out.println("Nth root: " + nthRoot(n, m));
    }

    static int nthRoot(int n, int m) {

        if (m == 0) return 0;

        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long value = power(mid, n, m);

            if (value <= m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    static long power(int mid, int n, int M) {

        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= mid;

            if (result > M) {
                return result;
            }
        }

        return result;
    }

}
