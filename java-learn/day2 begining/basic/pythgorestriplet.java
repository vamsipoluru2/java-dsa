package basic;

public class pythgorestriplet {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        System.out.println(tripliet(arr) ? "True" : "False");
    }
    static boolean tripliet(int[] arr) {
        int n = arr.length;

        // Exploring all possible triplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    // Calculate square of array elements
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];

                    // If these integers form Pythagorean triplet then
                    // return true
                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }

        return false;
    }
}
