import java.util.*;

public class UnionOfArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 6};

        // Brute force
        int[] ans1 = unionUsingSet(a, b);
        System.out.println("Using Set: " + Arrays.toString(ans1));

        // Optimal - Two Pointer
        int[] ans2 = unionUsingTwoPointer(a, b);
        System.out.println("Using Two Pointer: " + Arrays.toString(ans2));
    }


    // =====================================================
    // Brute Force - Using Set
    // =====================================================

    static int[] unionUsingSet(int[] a, int[] b) {

        Set<Integer> set = new TreeSet<>();

        // Add elements of first array
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // Add elements of second array
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        // Convert Set to array
        int[] ans = new int[set.size()];

        int i = 0;

        for (int x : set) {
            ans[i] = x;
            i++;
        }

        return ans;
    }


    // =====================================================
    // Optimal - Two Pointer
    // =====================================================

    static int[] unionUsingTwoPointer(int[] a, int[] b) {

        ArrayList<Integer> temp = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            // Take from a
            if (a[i] <= b[j]) {

                if (temp.size() == 0 ||
                    temp.get(temp.size() - 1) != a[i]) {

                    temp.add(a[i]);
                }

                i++;

            } 
            // Take from b
            else {

                if (temp.size() == 0 ||
                    temp.get(temp.size() - 1) != b[j]) {

                    temp.add(b[j]);
                }

                j++;
            }
        }

        // Remaining elements of a
        while (i < a.length) {

            if (temp.size() == 0 ||
                temp.get(temp.size() - 1) != a[i]) {

                temp.add(a[i]);
            }

            i++;
        }

        // Remaining elements of b
        while (j < b.length) {

            if (temp.size() == 0 ||
                temp.get(temp.size() - 1) != b[j]) {

                temp.add(b[j]);
            }

            j++;
        }

        // Convert ArrayList to int[]
        int[] ans = new int[temp.size()];

        for (int k = 0; k < temp.size(); k++) {
            ans[k] = temp.get(k);
        }

        return ans;
    }
}